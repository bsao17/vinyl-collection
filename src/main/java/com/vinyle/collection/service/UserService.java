package com.vinyle.collection.service;

import com.vinyle.collection.model.UserModel;
import com.vinyle.collection.repository.UserRepository;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Optional;

@Service
@Getter
@Setter
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserModel> getAllUser(){
        return userRepository.findAll();
    }

    public UserModel  getUserById(int id){
        return userRepository.getReferenceById(id);
    }

    public void addUser(UserModel userModel){
        userRepository.save(userModel);
    }

    public void updateUser(int id, UserModel userModel) throws NullPointerException {
        Optional<UserModel> userModelOption = userRepository.findById(id);
        if (userModelOption.isEmpty()){
            throw new NullPointerException();
        } else {
            userRepository.getReferenceById(id);
            userRepository.save(userModel);
        }
    }
}
