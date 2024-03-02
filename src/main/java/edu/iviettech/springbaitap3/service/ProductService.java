package edu.iviettech.springbaitap3.service;


import edu.iviettech.springbaitap3.entity.Product;
import org.springframework.data.domain.Page;


import java.util.List;

public interface ProductService {
  List<Product> getAllProduct();

  void create(Product product);

  List<Product> productList();

  Page<Product> paginationProducts(int pageNumber);

  void paginationAndSortProducts(int pageNumber);

  void insertProduct(Product product);

  List<Product> searchByCategory(String name);

  List<Product> searchByUnitPrice(double priceStart, double priceEnd);

  Product searchByName(String name);
}
