package com.peregud.calculation.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class RectangleUtil {

    public double calculatePerimeter(double firstSide, double secondSide) {
        return RoundUtil.up(2 * (firstSide + secondSide));
    }

    public double calculateArea(double firstSide, double secondSide) {
        return RoundUtil.up(firstSide * secondSide);
    }
}
