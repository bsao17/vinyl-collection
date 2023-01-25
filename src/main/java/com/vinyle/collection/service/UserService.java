package com.vinyle.collection.service;

import com.vinyle.collection.model.UserModel;
import com.vinyle.collection.repository.UserRepository;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    private List<UserModel> getAllUser(){
        return userRepository.findAll();
    }

    private UserModel  getUserById(int id){
        return userRepository.getReferenceById(id);
    }

    private void addUser(UserModel userModel){
        userRepository.save(userModel);
    }

    private void updateUser(int id, UserModel userModel){
        userRepository.getReferenceById(id);
        userRepository.save(userModel);
    }
}
