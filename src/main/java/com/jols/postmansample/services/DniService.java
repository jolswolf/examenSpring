package com.jols.postmansample.services;

import com.jols.postmansample.Interfaces.InterOperacion;
import com.jols.postmansample.entities.Dni;
import com.jols.postmansample.entities.Medio;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("DNI")
public class DniService implements InterOperacion {
    private Dni dni;
    private String[] letters;

    public DniService() {
        this.dni = new Dni();
        this.letters = dni.getLetras();
    }

    public String getDniLetter(int dniNumber) {
        int num;
        num = dniNumber % 23;
        return letters[num];
    }

    @Override
    public String Calcular(Medio medio) {
        int numDni = Integer.parseInt(medio.getVal1());
        String letter = medio.getVal2();
        if (letter.equals(getDniLetter(numDni))) {
            return "DNI correcto" + "   ||   " + "DNI: " + numDni + "   ||   " + "Letra: " + letter;
        }else {
            return "DNI incorrecto" + "   ||   " + "DNI: " + numDni + "   ||   " + "Letra: " + letter;
        }
    }
}
