package com.example.stevend288.bootstrap;

import com.example.stevend288.dao.CustomerRepository;
import com.example.stevend288.dao.DivisionRepository;
import com.example.stevend288.entities.Customer;
import com.example.stevend288.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrapper implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public Bootstrapper(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // The WGU database script already provides 1 default customer.
        // We only add our 5 if the database hasn't been populated yet.
        if (customerRepository.count() == 1) {

            // Grab the very first Division from the database to attach to our new customers
            Division division = divisionRepository.findAll().get(0);

            Customer c1 = new Customer();
            c1.setFirstName("John");
            c1.setLastName("Smith");
            c1.setAddress("123 Alpha St");
            c1.setPostal_code("12345");
            c1.setPhone("555-1111");
            c1.setDivision(division);
            customerRepository.save(c1);

            Customer c2 = new Customer();
            c2.setFirstName("Jane");
            c2.setLastName("Doe");
            c2.setAddress("456 Bravo St");
            c2.setPostal_code("67890");
            c2.setPhone("555-2222");
            c2.setDivision(division);
            customerRepository.save(c2);

            Customer c3 = new Customer();
            c3.setFirstName("Alice");
            c3.setLastName("Wonder");
            c3.setAddress("789 Charlie Ave");
            c3.setPostal_code("13579");
            c3.setPhone("555-3333");
            c3.setDivision(division);
            customerRepository.save(c3);

            Customer c4 = new Customer();
            c4.setFirstName("Bob");
            c4.setLastName("Builder");
            c4.setAddress("321 Delta Blvd");
            c4.setPostal_code("24680");
            c4.setPhone("555-4444");
            c4.setDivision(division);
            customerRepository.save(c4);

            Customer c5 = new Customer();
            c5.setFirstName("Charlie");
            c5.setLastName("Brown");
            c5.setAddress("654 Echo Ln");
            c5.setPostal_code("97531");
            c5.setPhone("555-5555");
            c5.setDivision(division);
            customerRepository.save(c5);
        }
    }
}