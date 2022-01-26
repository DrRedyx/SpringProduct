package com.example.SpringProduct;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Configuration
@SessionScope
public class Cart {
    private final List<Integer> shoppingCart;

    public Cart() {
        shoppingCart = new ArrayList<>();
    }

    public void setId(int productId) {
        shoppingCart.add(productId);
    }

    public List<Integer> getShoppingCart() {
        return shoppingCart;
    }
}