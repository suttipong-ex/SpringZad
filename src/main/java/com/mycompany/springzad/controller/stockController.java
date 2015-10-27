/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springzad.controller;

 
import com.mycompany.springzad.model.Stock;
import com.mycompany.springzad.repo.StockRepo;
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
public class stockController {
    @Autowired
    private StockRepo stockRepo;
    @RequestMapping(value="/stock",method = RequestMethod.POST)
    public void saveStock(@RequestBody Stock stock){
        stockRepo.save(stock);
    }    
    @RequestMapping(value="/deleteStock",method = RequestMethod.POST)
    public void deleteStock(@RequestBody Stock stock){
        stockRepo.delete(stock);
    }
    @RequestMapping(value="/getStock",method = RequestMethod.GET)
    private Page<Stock> getStock(Pageable pageable){
        return stockRepo.findAll(pageable);
    }    
}
