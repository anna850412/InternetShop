package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.ProductDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/product")
public class
ProductController {
    @RequestMapping(method = RequestMethod.GET, value = "getProducts")
    public List<ProductDto> getProducts(){
        return new ArrayList<>();
    }
    @GetMapping(value = "getProduct")
    public ProductDto getProduct(@RequestParam Long productId){
        return new ProductDto();
    }
    @PostMapping(value = "createProduct", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createProduct(@RequestBody ProductDto productDto){
    }
    @PutMapping(value = "updateProduct", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ProductDto updateProduct(@RequestBody ProductDto productDto){
        return new ProductDto();
    }
    @DeleteMapping(value = "deleteProduct")
    public void deleteProduct(@RequestParam Long productId){

    }
}