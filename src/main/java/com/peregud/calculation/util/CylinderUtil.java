package com.peregud.calculation.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CylinderUtil {

    public double calculateArea(double radius, double height) {
        return RoundUtil.up(2 * Math.PI * radius * (height + radius));
    }

    public double calculateVolume(double radius, double height) {
        return RoundUtil.up(Math.PI * Math.pow(radius, 2) * height);
    }
}
