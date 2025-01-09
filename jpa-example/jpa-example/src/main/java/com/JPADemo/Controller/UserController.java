package com.JPADemo.Controller;

import com.JPADemo.model.UserRecord;
import com.JPADemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping
    public List<UserRecord> getAllUser(){
        return userService.getAllUsers();
    }
    //@RequestMapping(value="users/add-user",method= RequestMethod.POST)
    @PostMapping("/add-user")
    public void addUser(@RequestBody UserRecord userRecord){
        userService.addUser(userRecord);
    }
}
