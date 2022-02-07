package ru.kosenko.eurekaclient_b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.kosenko.eurekaclient_b.converter.ProductMapper;
import ru.kosenko.eurekaclient_b.dto.ProductDto;
import ru.kosenko.eurekaclient_b.service.ProductService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ProductController {

    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;

    }

//    @GetMapping("/b/all")
//    public String getAllProduct(Model model) {
//        List<ProductDto> products =  productService.getAll().stream()
//                .map(productMapper::productToProductDto).collect(Collectors.toList());
//        model.addAttribute("products", products);
//        return "product_list";
//    }

    @GetMapping("/b/all")
    public String getAllProduct(Model model) {
        model.addAttribute("products", productService.getAll());
        return "product_list";
    }


//    @GetMapping("/b/info/{id}")
//    public String getStudentInfo(@PathVariable Long id, Model model) {
//        model.addAttribute("product", productMapper.productDto(productService.findById(id).orElse(null)));
//        return "product_info";
//    }

//        @GetMapping("/b/all")
//        public String allproduct() {
//        return "Hello!";
//    }

        @GetMapping("/b/product/{id}")
        public Integer product(@PathVariable Integer id) {
        return id * 10;
    }

}
