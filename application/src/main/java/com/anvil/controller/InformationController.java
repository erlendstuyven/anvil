package com.anvil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;

@RestController
public class InformationController {

    public InformationController() {
    }

    @GetMapping(path = "/horses/name")
    public String getHorseName() {
        return "BlackSwan2";
    }

    @Produces("application/json")
    @GetMapping(path = "/horses/information")
    public HorseInformation getHorseInformation() {
        return new HorseInformation("paardnaam", "paardeigenaar");
    }
}
