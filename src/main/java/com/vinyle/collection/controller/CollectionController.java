package com.vinyle.collection.controller;

import com.vinyle.collection.model.VinyleModel;
import com.vinyle.collection.service.CollectionService;
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

    @GetMapping
    public ArrayList<VinyleModel> getVinyleName(){
        //return vinyleModel.getTitle();

        ArrayList<VinyleModel> myVinyls = new ArrayList<>();

        VinyleModel Ghost = new VinyleModel();
        Ghost.setArtistName("Ghost");
        Ghost.setVinylTitle("Imperia");
        Ghost.setVinyle_id(1);
        Ghost.setVinylSize(33);
        Ghost.setVinylColor("black");
        Ghost.setVinylJacket("https://jacketGhost.com");
        myVinyls.add(Ghost);

        VinyleModel Soen = new VinyleModel();
        Soen.setArtistName("Soen");
        Soen.setVinyle_id(2);
        Soen.setVinylTitle("Antartica");
        Soen.setVinylSize(33);
        Soen.setVinylColor("black");
        Soen.setVinylJacket("https://soenJacket.com");
        myVinyls.add(Soen);

        return myVinyls;
    }

    /*@PostMapping("api/collection/{name}")
    private void setVinylName(String name){
        vinyleModel.setTitle(name);
    }*/
}
