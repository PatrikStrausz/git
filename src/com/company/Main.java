package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] cars = { "Audi","Skoda","BMW","Lada","Peugeot","Lancia"};


        Arrays.sort(cars, String::compareToIgnoreCase);
        for(String str: cars){
            System.out.println(str);
        }
    }
}
