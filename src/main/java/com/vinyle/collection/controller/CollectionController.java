package com.vinyle.collection.controller;

import com.vinyle.collection.model.VinyleModel;
import com.vinyle.collection.repository.CollectionRepository;
import com.vinyle.collection.repository.VinyleRepository;
import com.vinyle.collection.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/collection")
public class CollectionController {

    @Autowired
    private CollectionService collectionService;

    private VinyleModel vinyleModel;

    @GetMapping("api/collection/vinyle")
    public String getVinyleName(){
        return vinyleModel.getName();
    }
}
