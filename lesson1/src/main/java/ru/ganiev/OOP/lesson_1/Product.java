//Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
//        initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
package ru.ganiev.OOP.lesson_1;

public abstract class Product {
    private String name;
    private Double cost;



    public Product(String name, Double cost, Double volume){
        setName(name);
        setCost(cost);

    }
    public String getName() {

        return name;
    }

    public Double getCost() {
        return cost;
    }
    public void setName(String name){
        this.name = name;

    }

    public void setCost(Double cost){
        this.cost = cost;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

}

