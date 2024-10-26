package com.springboot_app.spring_first_app.Controller;

import com.springboot_app.spring_first_app.Service.UserService;
import com.springboot_app.spring_first_app.Model.User;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("api/v1/users")
    public List<User> getusers(){
    return userService.getusers();
    }
    @PostMapping("/user/save")
    public String setCar(@ModelAttribute User user){
        userService.saveUser(user);
        return "";
    }
    @PutMapping("/user/{id}")
    public String updateUser(@PathVariable long id, @ModelAttribute User user) {
        userService.updateUser(user, id);
        return "";
    }
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
        return "";
    }


}
