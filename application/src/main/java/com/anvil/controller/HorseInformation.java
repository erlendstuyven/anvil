package com.anvil.controller;

public class HorseInformation {
    private String naam;

    private String eigenaar;

    public HorseInformation(String naam, String eigenaar) {
        this.naam = naam;
        this.eigenaar = eigenaar;
    }

    // Needed to serialize HorseInformation object in restcontroller
    public String getNaam() {
        return naam;
    }

    // Needed to serialize HorseInformation object in restcontroller
    public String getEigenaar() {
        return eigenaar;
    }
}
