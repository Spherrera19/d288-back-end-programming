package com.example.stevend288.services;

import com.example.stevend288.dao.CartRepository;
import com.example.stevend288.entities.Cart;
import com.example.stevend288.entities.CartItem;
import com.example.stevend288.entities.StatusType;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private final CartRepository cartRepository;

    public CheckoutServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        // 1. Retrieve the cart info from the DTO
        Cart cart = purchase.getCart();

        // STEP G: VALIDATION
        // Check if the payload is empty or missing vital data
        if (customer == null || cart == null || cartItems == null || cartItems.isEmpty()) {
            return new PurchaseResponse("Error: Invalid Purchase Data");
        }

        // 2. Generate a unique tracking number (UUID)
        String orderTrackingNumber = UUID.randomUUID().toString();
        cart.setOrderTrackingNumber(orderTrackingNumber);

        // 3. Set the status to 'ordered' (using our Enum)
        cart.setStatus(StatusType.ordered);

        // 4. Populate the cart with cartItems
        Set<CartItem> cartItems = purchase.getCartItems();
        cartItems.forEach(item -> {
            item.setCart(cart); // Link item to the cart
            cart.getCartItem().add(item); // Add item to the cart's set
        });

        // 5. Link the customer to the cart
        cart.setCustomer(purchase.getCustomer());

        // 6. Save to the database
        cartRepository.save(cart);

        // 7. Return a response with the tracking number
        return new PurchaseResponse(orderTrackingNumber);
    }
}