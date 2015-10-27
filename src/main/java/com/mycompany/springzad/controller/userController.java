/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springzad.controller;

import com.mycompany.springzad.model.User;
import com.mycompany.springzad.repo.UserRepo;
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
public class userController {
    @Autowired
    private UserRepo userRepo;
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public void saveUser(@RequestBody User user){
     userRepo.save(user);
    }
    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    public void deleteUser(@RequestBody User user){
      userRepo.delete(user);
    }
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    private Page<User> getUser(Pageable pageable){
        return userRepo.findAll(pageable);
    } 
}
