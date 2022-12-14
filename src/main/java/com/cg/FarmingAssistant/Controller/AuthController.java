package com.cg.FarmingAssistant.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.FarmingAssistant.Entity.User;
import com.cg.FarmingAssistant.Service.AuthService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(value = "*")
//@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public User Register(@RequestBody User user) {

        return  authService.register(user);


    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {

        return authService.login(user);
    }

}
