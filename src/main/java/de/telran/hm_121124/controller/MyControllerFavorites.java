package de.telran.hm_121124.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping() //localhost:8088
public class MyControllerFavorites {

    @GetMapping(value = "/Favorites")
    String getFavorites() {
        return "Привет, я контроллер - " + getClass().getName();
    }

}
