package ru.ganiev.OOP.lesson_1;

public class BoutleOfWater extends Product{

    private Double volume;
    public BoutleOfWater(String name, Double cost, Double volume){
        super(name, cost, volume);
        getVolume();
    }
    public Double getVolume(){
        this.volume = volume;
        return volume;
    }
    public void setVolume(Double volume){
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BoutleOfWater{" +
                "name='" + super.getName() + '\'' +
                "cost='" + super.getCost() + '\'' +
                "volume=" + this.volume +
                '}';
    }
}
