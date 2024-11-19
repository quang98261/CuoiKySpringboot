package com.example.cuoiky.controllers;

import com.example.cuoiky.models.Product;
import com.example.cuoiky.services.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Controller
@RequestMapping("/")
public class ProductsController {
    @Autowired
    private ProductsRepository repo;


    @GetMapping({ "/cart"})
    public String ShowProductList(Model model) {
        List<Product> products = repo.findAll();//Sort.by(Sort.Direction.DESC, "id")
        model.addAttribute("products", products);
        return "/products/cart";
    }
    @GetMapping({"", "/"})
    public String homeProductList(Model model) {
        List<Product> products = repo.findAll();//Sort.by(Sort.Direction.DESC, "id")
        model.addAttribute("products", products);
        return "/products/home";
    }
    @GetMapping({ "/product"})
    public String productProductList(Model model) {
        List<Product> products = repo.findAll();//Sort.by(Sort.Direction.DESC, "id")
        model.addAttribute("products", products);
        return "/products/products";
    }

    @GetMapping({ "/login"})
    public String loginProductList(Model model) {
        List<Product> products = repo.findAll();//Sort.by(Sort.Direction.DESC, "id")
        model.addAttribute("products", products);
        return "/products/login";
    }

}
