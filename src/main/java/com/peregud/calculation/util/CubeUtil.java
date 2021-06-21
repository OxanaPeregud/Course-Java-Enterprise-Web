package com.peregud.calculation.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CubeUtil {

    public double calculateArea(double side) {
        return RoundUtil.up(6 * Math.pow(side, 2));
    }

    public double calculateVolume(double side) {
        return RoundUtil.up(Math.pow(side, 3));
    }
}
