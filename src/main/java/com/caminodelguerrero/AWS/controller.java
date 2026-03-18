package com.caminodelguerrero.AWS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping
    public String saludoCordial(){
        return "<H1>Saludos cordiales Lemuel de mrda! >:D</H1>";
    }
}
