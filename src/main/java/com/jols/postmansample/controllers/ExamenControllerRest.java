package com.jols.postmansample.controllers;

import com.jols.postmansample.entities.Dni;
import com.jols.postmansample.entities.Imc;
import com.jols.postmansample.entities.Medio;
import com.jols.postmansample.services.BisService;
import com.jols.postmansample.services.DniService;
import com.jols.postmansample.services.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExamenControllerRest {
    public static final String IMC_PATH = "/imc";
    public static final String DNI_PATH = "/dni";
    public static final String BIS_PATH = "/bis/{ano}";

    @Autowired(required = false)
    DniService dniService;
    @Autowired(required = false)
    BisService bisService;
    @Autowired(required = false)
    ImcService imcService;

    @GetMapping(value = DNI_PATH)
    public String Dni(Medio medio){
        return dniService.getDniLetter(Integer.parseInt(medio.getVal1()));
    }

    @PostMapping(value = IMC_PATH)
    public String Imc(Medio medio){
        return imcService.calcularImc();
    }

    @GetMapping(value = BIS_PATH)
    @ResponseBody
    public String Bis(@PathVariable Integer ano){
         return bisService.getBis(ano);
    }

}
