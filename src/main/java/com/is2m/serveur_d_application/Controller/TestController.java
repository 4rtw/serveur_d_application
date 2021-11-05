package com.is2m.serveur_d_application.Controller;

import com.is2m.serveur_d_application.Model.Test;
import com.is2m.serveur_d_application.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/api/test")
    public Test createTest(@RequestBody Test test){
        return testService.createTest(test);
    }
}
