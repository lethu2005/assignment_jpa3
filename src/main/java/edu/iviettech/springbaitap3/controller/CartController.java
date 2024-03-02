package edu.iviettech.springbaitap3.controller;


import edu.iviettech.springbaitap3.domain.CartHolder;
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


@RequestMapping("cart")
@Controller
public class CartController {

    @Autowired
    private CartHolder cartHolder;

    @Autowired
    private ProductServiceImpl productService;
    @GetMapping
    public String showCart(Model model) {
    model.addAttribute("cart", cartHolder);
    return "cart/list";
    }


    @PostMapping
    public String addToCart(Model model, @ModelAttribute Product product){
        cartHolder.addToCart(product);

        List<Product> products = productService.productList();
        model.addAttribute("products",products);
        return "product/list";
    }


}
