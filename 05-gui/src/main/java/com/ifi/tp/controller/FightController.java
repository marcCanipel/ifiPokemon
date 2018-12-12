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

    @Autowired
    private TrainerService trainerService;


    @GetMapping("/fight")
    ModelAndView index(){
        var modelAndView = new ModelAndView("fight");

        int id_fighter01 = trainerService.getTrainer("Misty").getTeam().get(0).getType().getId();
        int id_fighter02 = trainerService.getTrainer("Ash").getTeam().get(0).getType().getId();

        modelAndView.addObject("fighter01", pokemonService.getPokemonType(id_fighter01));
        modelAndView.addObject("fighter02", pokemonService.getPokemonType(id_fighter02));

//        modelAndView.addObject("trainer01", trainerService);
//        modelAndView.addObject("trainer02", trainerService);

        //System.out.println(trainerService.getTrainer("Ash").getTeam().get(0));

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
