package com.jols.postmansample.services;

import com.jols.postmansample.Interfaces.InterOperacion;
import com.jols.postmansample.entities.Anos;
import com.jols.postmansample.entities.Medio;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("BIS")
public class BisService implements InterOperacion {
    private Anos anos;
    private int year;

    public BisService() {
        Anos anoss = new Anos();
    }

    public String getBis(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return "El año " + year + " es bisiesto";
        }else {
            return "El año " + year + " no es bisiesto";
        }
    }
    @Override
    public String Calcular(Medio medio) {
        int year = Integer.parseInt(medio.getVal1());
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return "El año " + year + " es bisiesto";
        }else {
            return "El año " + year + " no es bisiesto";
        }
    }
}
