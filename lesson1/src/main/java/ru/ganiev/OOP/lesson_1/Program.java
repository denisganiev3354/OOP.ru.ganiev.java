package ru.ganiev.OOP.lesson_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        HotDrink coffee = new HotDrink("cofee", 50.00, 0.5, 90);
        HotDrink milk = new HotDrink("milk", 34.00, 0.4, 60);
        HotDrink tea = new HotDrink("tea", 11.20, 0.6, 90);
        List<HotDrink> hotDrinksList  = new ArrayList<>(Arrays.asList(coffee, milk, tea));

        HotDrinkVendingMachine vmHotDrinks = new HotDrinkVendingMachine(hotDrinksList);

        System.out.println(vmHotDrinks.getProduct("milk"));
    }
}