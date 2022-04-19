package com.jols.postmansample.services;

import com.jols.postmansample.Interfaces.InterOperacion;
import com.jols.postmansample.entities.Imc;
import com.jols.postmansample.entities.Medio;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("IMC")

public class ImcService implements InterOperacion {
    private Imc imc;
    private double weight;
    private double height;
    private String category;

    public ImcService(){
        this.imc = new Imc();
        this.weight = 1.90;
        this.height = 120;
        this.category = "Sobrepeso";
        imc.setHeight(height);
        imc.setWeight(weight);
    }

    public String calcularImc(){
        double imc = weight / (height * height);
        return imc + "";
    }

    @Override
    public String Calcular(Medio medio){
        double weight = Double.parseDouble(medio.getVal2());
        double height = Double.parseDouble(medio.getVal1());
        double imc = weight / (height * height);
        if (imc >= 30) {
            return "IMC: " + imc + " - " + "Obesidad";
        }else if (imc >= 25) {
            return "IMC: " + imc + " - " + "Sobrepeso";
        }else if (imc >= 18.5) {
            return "IMC: " + imc + " - " + "Normal";
        }else{
            return "IMC: " + imc + " - " + "Bajo peso";
        }
    }

}
