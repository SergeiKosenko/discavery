package ru.kosenko.eurekaclient_a;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("product-repo")
public interface ProductInterface {

    @GetMapping("/b/all")
    String allproduct();

    @GetMapping("/b/product/{id}")
    Integer product(@PathVariable Integer id);
}
