package com.vinyle.collection.controller;

import com.vinyle.collection.model.VinyleModel;
import com.vinyle.collection.service.CollectionService;
import com.vinyle.collection.service.VinylesService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/vinyles")
@Getter
@Setter
public class CollectionController {

    @Autowired
    private CollectionService collectionService;

    @Autowired
    private VinylesService vinylesService;

    @GetMapping
    public VinylesService getVinylesService() {
        return vinylesService;
    }

    /*@PostMapping("api/collection/{name}")
    private void setVinylName(String name){
        vinyleModel.setTitle(name);
    }*/
}
