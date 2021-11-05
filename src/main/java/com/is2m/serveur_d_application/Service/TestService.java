package com.is2m.serveur_d_application.Service;

import com.is2m.serveur_d_application.Model.Test;
import com.is2m.serveur_d_application.Repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public Test createTest(Test test){
        return testRepository.save(test);
    }
}
