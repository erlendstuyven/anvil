package com.anvil.domain;

import com.anvil.domain.specification.BlueHorseSpecification;
import com.anvil.domain.specification.HorseColorSpecification;
import com.anvil.domain.specification.RedHorseSpecification;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class HorseColorDomainServiceTest {

    private HorseColorDomainService horseColor;

    @Before
    public void setup() {
        ArrayList<HorseColorSpecification> horseColorSpecifications = new ArrayList<>();
        horseColorSpecifications.add(new BlueHorseSpecification());
        horseColorSpecifications.add(new RedHorseSpecification());
        horseColor = new HorseColorDomainService(horseColorSpecifications);
    }

    @Test
    public void getHorseColor_HorseTypeOneColor_returnsCorrectColor() throws Exception {
        assertThat(horseColor.getHorseColor(HorseType.RED_HORSE)).isEqualTo(Color.RED);
        assertThat(horseColor.getHorseColor(HorseType.BLUE_HORSE)).isEqualTo(Color.BLUE);
    }

    @Test
    public void getHorseColor_HorseTypeMoreThanOneColor_returnsCorrectColors() throws Exception {
        assertThat(horseColor.getHorseColors(HorseType.RED_BLUE_HORSE)).contains(Color.RED, Color.BLUE);
    }

}