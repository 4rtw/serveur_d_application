package com.is2m.serveur_d_application.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.Date;

@Document
@Setter
@Getter
@AllArgsConstructor
public class Pointage {

    @Id
    private String id = generateId();

    private int matricule;

    //Enseignant/Etudiant
    private String statut;

    private String nom;
    private String prenom;

    private String dateHeure;

    //entrée/sortie
    private String sens;

    private String generateId(){
        //maka timestamp
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        //int timestamp = (double) mTimestamp;

        //Valeur aleatoire
        int max = 10000;
        int min = 0;
        int nextValue = (int) Math.round(Math.random() * (max-min+1)+min);


        return timestamp.getTime() + String.valueOf(nextValue);
    }
}
