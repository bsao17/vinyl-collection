package com.vinyle.collection.controller;

import com.vinyle.collection.model.VinylModel;
import com.vinyle.collection.service.CollectionService;
import com.vinyle.collection.service.VinylService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@Getter
@Setter
public class VinylController {

    @Autowired
    private CollectionService collectionService;

    @Autowired
    private VinylService vinylesService;

    @GetMapping(path = "/vinyls")
    public List<VinylModel> getVinylesService() {
        return vinylesService.getAll();
    }

    @PostMapping(path = "/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public VinylModel createVinyl(@RequestBody VinylModel vinylModel){
        return vinylesService.save(vinylModel);
    }
}