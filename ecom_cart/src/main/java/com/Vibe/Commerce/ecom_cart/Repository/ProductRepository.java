package com.Vibe.Commerce.ecom_cart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Vibe.Commerce.ecom_cart.Entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}