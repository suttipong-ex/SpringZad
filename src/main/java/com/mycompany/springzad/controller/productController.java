/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springzad.controller;

import com.mycompany.springzad.model.Product;
import com.mycompany.springzad.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author suttipong
 */
@RestController
public class productController {
    @Autowired
    private ProductRepo productRepo;
    @RequestMapping(value = "/product",method = RequestMethod.POST)
    public void saveProduct(@RequestBody Product product){
      productRepo.save(product);
    }
    @RequestMapping(value = "/deleteProduct",method = RequestMethod.POST)
    public void deleteProduct(@RequestBody Product product){
       productRepo.delete(product);
    }
    @RequestMapping(value ="/getProduct",method = RequestMethod.GET)
    private Page<Product> getProduct(Pageable pageable){
        return productRepo.findAll(pageable);
    }
}
