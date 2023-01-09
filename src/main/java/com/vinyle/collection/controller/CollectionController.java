package com.vinyle.collection.controller;

import com.vinyle.collection.model.VinyleModel;
import com.vinyle.collection.service.CollectionService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/collection")
@Getter
@Setter
public class CollectionController {

    @Autowired
    private CollectionService collectionService;

    private VinyleModel vinyleModel;

    @GetMapping("api/collection/vinyle")
    public String getVinyleName(){
        return vinyleModel.getTitle();
    }

    @PostMapping("api/collection/{name}")
    private void setVinylName(String name){
        vinyleModel.setTitle(name);
    }
}
