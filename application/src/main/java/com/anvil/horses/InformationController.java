package com.anvil.horses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformationController {

    public InformationController() {
    }

    @GetMapping(path = "/horses/name")
    public String getHorseInformation() {
        return "BlackSwan";
    }
}
