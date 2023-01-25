package com.vinyle.collection.controller;

import com.vinyle.collection.model.UserModel;
import com.vinyle.collection.repository.UserRepository;
import com.vinyle.collection.service.UserService;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/all")
    public List<UserModel> getUsers(){
        return userService.getUserRepository().findAll();
    }

    @GetMapping(path = "/{id}")
    public UserModel getUser( @PathVariable int id){
        return userService.getUserById(id);
    }

    @PostMapping(path = "/new")
    @ResponseStatus(code = HttpStatus.CREATED)
    private void addUser (@RequestBody UserModel userModel){
        userService.addUser(userModel);
    }

    @PutMapping(path = "/update/{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void updateById(@PathVariable int id, @RequestBody UserModel userModel){
        userService.updateUser(id, userModel);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteUser( @PathVariable int id){
        userService.deleteUser(id);
    }

}
