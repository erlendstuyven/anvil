package com.anvil.domain.specification;

import com.anvil.domain.Color;
import com.anvil.domain.HorseType;

public interface HorseColorSpecification {

    public boolean isSatisfied(HorseType horseType);

    public Color getColor(HorseType horseType);
}
