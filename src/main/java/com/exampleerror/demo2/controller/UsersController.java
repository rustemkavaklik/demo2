package com.exampleerror.demo2.controller;


import com.exampleerror.demo2.entity.Users;
import com.exampleerror.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")        //main url
public class UsersController {


    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")        //get in bir parcasi
    public ResponseEntity<List<Users>> getAllUsers(){
        List<Users>users = null;
        try{
            users= userService.getAllUsers();
        }catch(Exception e){
            e.getMessage();
        }
        return new ResponseEntity<List<Users>>(users,HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")        //get in bir parcasi
    public ResponseEntity<Users> getUsersByID(@PathVariable("id") int userId){
        Users users = null;
        try{
            users= userService.getUserById(userId);
        }catch(Exception e){
            e.getMessage();
        }
        return new ResponseEntity<Users>(users, HttpStatus.OK);
    }

    @PostMapping("/addOrUpdate")        //get in bir parcasi
    public ResponseEntity<Users> addOrUpdate(@RequestBody Users user){
        Users users = null;
        try{
            users= userService.addOrUpdateUser(user);
        }catch(Exception e){
            e.getMessage();
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")        //get in bir parcasi
    public ResponseEntity<Users> addOrUpdate(@PathVariable("id") int userId){
        Users users = null;
        try{
            users= userService.deleteUser(userId);
        }catch(Exception e){
            e.getMessage();
        }
        return new ResponseEntity<Users>(users, HttpStatus.OK);
    }

}
