package com.is2m.serveur_d_application.Service;

import com.is2m.serveur_d_application.Model.Pointage;
import com.is2m.serveur_d_application.Repositories.PointageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointageService {

    @Autowired
    private PointageRepository pointageRepository;

    public Pointage createPointage(Pointage pointage){
        //return pointageRepository.save(pointage);

        return pointageRepository.save(pointage);
    }

    public List<Pointage> createPointages(List<Pointage> pointages){
        return pointageRepository.saveAll(pointages);
    }

    public Pointage updatePointage(Pointage pointage){
        Pointage pointageAModifier = pointageRepository.findById(pointage.getId()).orElse(null);

        assert pointageAModifier != null;
        pointageAModifier.setNom(pointage.getNom());
        pointageAModifier.setPrenom((pointage.getPrenom()));

        return pointageRepository.save(pointageAModifier);
    }

    public String deletePointage(String id){
        Pointage pointageDelete = pointageRepository.findById(id).orElse(null);
        assert pointageDelete != null;
        pointageRepository.delete(pointageDelete);

        return "vofafa";
    }
}
