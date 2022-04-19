package com.jols.postmansample.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dni {
    private Integer num;
    private String letra;
    private String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    private Boolean es_correcta;
    public Dni() {
    }
}
