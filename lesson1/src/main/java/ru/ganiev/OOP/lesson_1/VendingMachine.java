package ru.ganiev.OOP.lesson_1;

import java.util.List;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException, IllegalAccessException;
    boolean addProduct(List<Product>productList);
}
