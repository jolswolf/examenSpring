package com.jols.postmansample.controllers;

import com.jols.postmansample.Interfaces.InterOperacion;
import com.jols.postmansample.entities.Medio;
import com.jols.postmansample.services.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ExamenController {
    @Autowired
    private InterOperacion interOperacion;
    @GetMapping("/calcular")
    public ModelAndView CalcularForm(Medio medio) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("medio", medio);
        mav.addObject("message", interOperacion.Calcular(medio));
        mav.setViewName("index");
        return mav;
    }
    @GetMapping("/")
    public ModelAndView index() {
        Medio medio = new Medio();
        ModelAndView mav = new ModelAndView();
        mav.addObject("medio", medio);
        mav.setViewName("index");
        return mav;
    }
}
