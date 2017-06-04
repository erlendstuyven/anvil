package com.anvil.domain.specification;

import com.anvil.domain.Color;
import com.anvil.domain.HorseType;

import javax.inject.Named;

import static com.anvil.domain.HorseType.RED_BLUE_HORSE;
import static com.anvil.domain.HorseType.RED_HORSE;

@Named
public class RedHorseSpecification implements HorseColorSpecification {

    @Override
    public boolean isSatisfied(HorseType horseType) {
        if (horseType == RED_HORSE || horseType == RED_BLUE_HORSE) {
            return true;
        };
        return false;
    }

    @Override
    public Color getColor(HorseType horseType) {
        return Color.RED;
    }
}
