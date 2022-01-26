package com.example.SpringProduct;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ShopServiceImpl implements ShopService{

    private final Cart cart;

    public ShopServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public Integer add(int productId) {
        cart.setId(productId);
        return productId;
    }

    @Override
    public Collection printAllProduct() {
        return cart.getShoppingCart();
    }
}
