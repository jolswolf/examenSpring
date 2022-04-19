package com.jols.postmansample.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Imc{
    private Double weight;
    private Double height;
    private String[] categories = {"Sobrepeso", "Normal", "Bajo peso", "Obesidad"};
    private String category = "Sobrepeso";
    private Double imc;

    public Imc () {

    }
}
