package com.Vibe.Commerce.ecom_cart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Vibe.Commerce.ecom_cart.Entity.CartItem;

import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<CartItem, Integer> {
    Optional<CartItem> findByProductId(int productId);
}