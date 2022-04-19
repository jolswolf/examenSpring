package com.jols.postmansample.services;

import com.jols.postmansample.entities.Dni;
import com.jols.postmansample.entities.Imc;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import static java.lang.Float.parseFloat;

@Service
@Getter
@Setter
public class ExamenService {
    private Imc imcEntity;
    private Dni dniEntity;
    private String imc;
    private String letra_dni;
    private Boolean letra_dni_correcta;
    private Boolean es_bisiesto;
    private String[] categorias;
    private String[] letras;
    private String letra_correcta;
    private String categoria_correcta;
    private String resultado;

    public ExamenService(){
        this.dniEntity = new Dni();
        this.imcEntity = new Imc();

        this.imc = "";
        this.letra_dni = "";
        this.letra_dni_correcta = false;
        this.es_bisiesto = false;
        this.categorias = imcEntity.getCategories();
        this.letras = dniEntity.getLetras();
        this.letra_correcta = "";
        this.resultado = "";
    }

    @Profile("IMC")
    public void calcular_imc(String valor1, String valor2){
        double val1 = Double.parseDouble(valor1);
        double val2 = Double.parseDouble(valor2);

        imc = (val1 / (val2 * val2) + "");
        if (Double.parseDouble(imc) >= 30){
            categoria_correcta = categorias[3];
            resultado = categoria_correcta + " " + imc;
        }else if (Double.parseDouble(imc) >= 25){
            categoria_correcta = categorias[0];
            resultado = categoria_correcta + " " + imc;
        }else if (Double.parseDouble(imc) >= 18.5){
            categoria_correcta = categorias[1];
            resultado = categoria_correcta + " " + imc;
        }else{
            categoria_correcta = categorias[2];
            resultado = categoria_correcta + " " + imc;
        }
    }

    @Profile("DNI")
    public void calcular_dni(String valor1, String valor2){
        double val1 = Double.parseDouble(valor1);
        double val2 = Double.parseDouble(valor2);

        letra_correcta = letras[(int) (val1) % 26];
        if (letra_correcta.equals(val2)){
            letra_dni_correcta = true;
            resultado = "Letra correcta";
        }else{
            letra_dni_correcta = false;
            resultado = "Letra incorrecta, la letra correcta es " + letra_correcta;
        }
    }

    @Profile("BIS")
    public void calcular_bis(String valor1, String valor2){
        double val1 = Double.parseDouble(valor1);
        if (val1 % 4 == 0){
            es_bisiesto = true;
            resultado = "Es bisiesto";
        }else{
            es_bisiesto = false;
            resultado = "No es bisiesto";
        }
    }
}
