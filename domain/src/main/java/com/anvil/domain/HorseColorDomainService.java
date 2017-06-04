package com.anvil.domain;

import com.anvil.domain.specification.HorseColorSpecification;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.stream.Collectors;

@Named
public class HorseColorDomainService {

    private final List<HorseColorSpecification> horseColorSpecifications;

    @Inject
    public HorseColorDomainService(List<HorseColorSpecification> horseColorSpecifications) {
        this.horseColorSpecifications = horseColorSpecifications;
    }

    public Color getHorseColor(HorseType horseType) {
        Color color = horseColorSpecifications.stream()
                .filter(horseColorSpecification -> horseColorSpecification.isSatisfied(horseType))
                .findFirst()
                .map(horseColorSpecification -> horseColorSpecification.getColor(horseType))
                .get();
        return color;
    }

    public List<Color> getHorseColors(HorseType horseType) {
        return horseColorSpecifications.stream()
                .filter(horseColorSpecification -> horseColorSpecification.isSatisfied(horseType))
                .map(horseColorSpecification -> horseColorSpecification.getColor(horseType))
                .collect(Collectors.toList());
    }
}
