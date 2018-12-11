package com.ifi.tp.controller;

import com.ifi.tp.pokemonTypes.service.PokemonService;
import com.ifi.tp.trainers.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FightController {

    @Autowired
    private PokemonService pokemonService;


    @GetMapping("/fight")
    ModelAndView index(){
        var modelAndView = new ModelAndView("fight");
        //var modelAndView2 = new ModelAndView("fight");

        modelAndView.addObject("fighter01", pokemonService.getPokemonType(45));
        modelAndView.addObject("fighter02", pokemonService.getPokemonType(59));

        return modelAndView;
    }

//    //@GetMapping("/fight/{name}")
//    ModelAndView index(@PathVariable String name){
//        var modelAndView = new ModelAndView("fight");
//
//        modelAndView.addObject("fight", pokemonService.getPokemonType(90));
//
//        return modelAndView;
//    }
}
