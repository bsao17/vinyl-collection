package com.vinyle.collection.service;

import com.vinyle.collection.model.VinylModel;
import com.vinyle.collection.repository.VinylRepository;
import jakarta.persistence.EntityManager;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@Getter
@Setter
public class VinylService {

    @Autowired
    private final VinylRepository vinyleRepository;

    // rappel: constructeur obligatoire lorsqu'il y a injection de dépendance avec @Autowired et une constante avec final
    public VinylService(VinylRepository vinyleRepository) {
        this.vinyleRepository = vinyleRepository;
    }

    public List<VinylModel> getAll(){
        return vinyleRepository.findAll();
    }

    public VinylModel getById(int id){
        return vinyleRepository.getReferenceById(id);
    }

    public VinylModel save(VinylModel vinyleModel){
        return vinyleRepository.save(vinyleModel);
    }

    public void update(int id, VinylModel vinyleModel) throws Exception {
        Optional<VinylModel> vinylModelOption = vinyleRepository.findById(id);
        if(vinylModelOption.isEmpty()){
            throw new Exception("Id Not Found !!!");
        } else {
            vinyleModel.setVinyl_id(id);
            vinyleRepository.save(vinyleModel);
        }
    }

    public void deletVinyl(int id){
        vinyleRepository.deleteById(id);
    }
}
