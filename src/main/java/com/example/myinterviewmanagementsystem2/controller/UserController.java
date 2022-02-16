package com.example.myinterviewmanagementsystem2.controller;

import com.example.myinterviewmanagementsystem2.Security.services.UserDetailsServiceImpl;
import com.example.myinterviewmanagementsystem2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {
    @Autowired
    private UserDetailsServiceImpl userService;

    //@Secured({"ROLE_ADMIN", "ROLE_USER"})
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value="/users", method = RequestMethod.GET)
    public List listUser(){
        return userService.getFindAll();
    }

    //@Secured("ROLE_USER")
    //@PreAuthorize("hasRole('USER')")
    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public Optional<User> getOne(@PathVariable(value = "id") Long id){
        return userService.loadById(id);
    }

//    @PreAuthorize("hasRole('ADMIN')")
//    @RequestMapping(value="/user/{id}", method = RequestMethod.DELETE)
//    public User deleteUser(@PathVariable(value = "id") Long id){
//        userService.delete(id);
//        return new User();
//    }
}
