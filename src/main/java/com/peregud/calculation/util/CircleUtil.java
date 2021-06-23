package com.peregud.calculation.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CircleUtil {

    public double calculatePerimeter(double radius) {
        return RoundUtil.up(2 * Math.PI * radius);
    }

    public double calculateArea(double radius) {
        return RoundUtil.up(Math.pow(radius, 2) * Math.PI);
    }
}
