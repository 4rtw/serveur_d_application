package com.is2m.serveur_d_application.Controller;

import com.is2m.serveur_d_application.Model.Pointage;
import com.is2m.serveur_d_application.Service.PointageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PointageController {

    @Autowired
    private PointageService pointageService;

    @PostMapping("/api/pointage")
    public Pointage createPointage(@RequestBody Pointage pointage){
        return pointageService.createPointage(pointage);
    }

    @PostMapping("/api/pointages")
    public List<Pointage> createPointage(@RequestBody List<Pointage> pointage){
        return pointageService.createPointages(pointage);
    }
}
