package com.Vibe.Commerce.ecom_cart.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Vibe.Commerce.ecom_cart.Entity.CartItem;
import com.Vibe.Commerce.ecom_cart.Entity.Receipt;
import com.Vibe.Commerce.ecom_cart.Service.CartService;

@RestController
@RequestMapping("/api/checkout")
@CrossOrigin(origins = "http://localhost:5173")
public class CheckoutController {

    @Autowired
    private CartService cartService;

    @PostMapping
    public Receipt checkout(@RequestBody List<CartItem> cartItems) {
        double total = cartService.getCartTotal();
        Receipt receipt = new Receipt(cartItems, total);
        cartService.clearCart();
        return receipt;
    }
}