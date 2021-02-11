package com.company;

import java.util.Arrays;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {
        BiFunction<Double, Double, Double> percentage = CalcPercentage::calculatePercentage;
        Double result = percentage.apply(31.0, 25.0);
        System.out.println("Congratulation you scored: "+Math.round(result)+"%");
    }
}
