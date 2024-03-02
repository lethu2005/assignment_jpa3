package edu.iviettech.springbaitap3.controller;


import edu.iviettech.springbaitap3.entity.Product;
import edu.iviettech.springbaitap3.service.Impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/product")
@Controller
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping
    public String showProduct(Model model){
        List<Product> products = productService.productList();
        model.addAttribute("products", products);

        return "product/list";
    }

  @GetMapping("create-page")
  public String showCreateProductPage(Model model) {

    model.addAttribute("product", new Product());

    return "product/add";
  }
  @PostMapping
  public String addProducts(@ModelAttribute Product product, Model model) {

    productService.create(product);

    // Show list
    List<Product> products = productService.productList();
    model.addAttribute("products", products);
    return "product/list";
  }
}
