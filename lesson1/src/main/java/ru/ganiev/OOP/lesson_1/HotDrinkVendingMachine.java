package ru.ganiev.OOP.lesson_1;

import com.sun.source.tree.BreakTree;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private final List<HotDrink>products;
    public HotDrinkVendingMachine(List<HotDrink>products){

        this.products = products;
    }
    public Product getProduct(String name){
        for (Product product: products) {
            if(product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    @Override
    public boolean addProduct(List<Product> productList) {
        return false;
    }

    public HotDrink getProduct(String name, Double volume, Double temperature) {
        for (Product product : products) {
            Object Product = null;
            if (Product instanceof HotDrink) {
                if (product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getVolume() == volume) {

                }
            }

        }
        return (HotDrink) products;
    }

}
