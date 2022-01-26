package com.example.SpringProduct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/add")
    public String add(@RequestParam(value = "productId") Integer productId) {
        shopService.add(productId);
        return "Продукт под номер " + productId + "успешно добавлен";
    }

    @GetMapping("/get")
    public String get() {
        return "Список id продуктов" + shopService.printAllProduct();
    }
}
