/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springzad.repo;

import com.mycompany.springzad.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author suttipong
 */
public interface StockRepo extends JpaRepository<Stock, Integer>{
    
}
