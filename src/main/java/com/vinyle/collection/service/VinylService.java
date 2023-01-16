package com.vinyle.collection.service;

import com.vinyle.collection.model.VinylModel;
import com.vinyle.collection.repository.VinylRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
public class VinylService {

    @Autowired
    private VinylRepository vinyleRepository;
    private VinylModel vinyleModel = new VinylModel();

    /*public ArrayList<VinyleModel> getVinyle(){

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
    }*/

    public List<VinylModel> getAll(){
        return vinyleRepository.findAll();
    }

    public VinylModel getById(int id){
        return vinyleRepository.getReferenceById(id);
    }

    public VinylModel save(VinylModel vinyleModel){
        return vinyleRepository.save(vinyleModel);
    }
}
