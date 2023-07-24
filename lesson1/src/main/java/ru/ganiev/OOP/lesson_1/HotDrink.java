package ru.ganiev.OOP.lesson_1;
public class HotDrink extends Product {
    private Double volume;
    private Integer temperature;

    public HotDrink(String name, Double cost, Double volume, Integer temperature) {
        super(name, cost, volume);
        this.temperature = temperature;

    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;

    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                "cost='" + super.getCost() + '\'' +
                "temperature=" + this.temperature +
                '}';
    }

    public Double getVolume() {
        this.volume = volume;
        return volume;
    }
}