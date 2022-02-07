package ru.kosenko.eurekaclient_a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebClientProductController {

//private RestTemplate restTemplate;
//
//    public WebClientProductController(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }

    private ProductInterface productInterface;

    public WebClientProductController(ProductInterface productInterface) {
        this.productInterface = productInterface;
    }

    @GetMapping("/all")
    public String allproduct() {
//        return restTemplate.getForObject("http://product-repo/b/all", String.class);
        return productInterface.allproduct();
    }

    @GetMapping("/product/{id}")
    public Integer product(@PathVariable Integer id) {
//        return restTemplate.getForObject("http://product-repo/b/product/" + id, Integer.class);
        return productInterface.product(id);
    }

//    @GetMapping("/info/{id}")
//    public String getStudentInfo(@PathVariable Long id, Model model) {
//        model.addAttribute("product", productMapper.productToProductDto(productService.findById(id).orElse(null)));
//        return "product_info";
//    }
}
