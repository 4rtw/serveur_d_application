package com.is2m.serveur_d_application.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document
public class Test {
    @Id
    private int id;
    private String nom;
    private String prenom;
}
