package edu.iviettech.springbaitap3.repository;


import edu.iviettech.springbaitap3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
//    List<Product> findAllByUnitPrice(double price, Pageable pageable);
    List<Product> findProductByProductNameContains(String name);
    List<Product> findProductByUnitPriceBetween(double priceStart, double priceEnd);
    Product findProductByProductName(String name);
}
