package com.anvil.domain.specification;

import com.anvil.domain.Color;
import com.anvil.domain.HorseType;

import javax.inject.Named;

import static com.anvil.domain.HorseType.BLUE_HORSE;
import static com.anvil.domain.HorseType.RED_BLUE_HORSE;

@Named
public class BlueHorseSpecification implements HorseColorSpecification {

    @Override
    public boolean isSatisfied(HorseType horseType) {
        if (horseType == BLUE_HORSE || horseType == RED_BLUE_HORSE) {
            return true;
        };
        return false;
    }

    @Override
    public Color getColor(HorseType horseType) {
        return Color.BLUE;
    }
}
