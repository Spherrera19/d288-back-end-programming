package com.example.stevend288.services;

import com.example.stevend288.entities.Cart;
import com.example.stevend288.entities.CartItem;
import com.example.stevend288.entities.Customer;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Purchase {

    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;

}