package com.vinyle.collection.controller;

import com.vinyle.collection.model.VinyleModel;
import com.vinyle.collection.repository.VinyleRepository;
import com.vinyle.collection.service.CollectionService;
import com.vinyle.collection.service.VinylesService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Getter
@Setter
public class CollectionController {

    @Autowired
    private CollectionService collectionService;

    @Autowired
    private VinylesService vinylesService;

    @GetMapping("/vinyles")
    public List<VinyleModel> getVinylesService() {
        return vinylesService.getAll();
    }

    @PostMapping("/new-vinyle")
    public void save(){
        vinylesService.save();
    }
}
