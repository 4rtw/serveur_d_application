package com.is2m.serveur_d_application.Repositories;

import com.is2m.serveur_d_application.Model.Pointage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PointageRepository extends MongoRepository<Pointage, String> {
}
