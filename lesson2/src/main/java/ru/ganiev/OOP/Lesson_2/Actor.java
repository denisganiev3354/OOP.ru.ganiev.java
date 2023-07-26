package ru.ganiev.OOP.Lesson_2;
public abstract class Actor {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public abstract void setMakeOrder();

    public abstract void setTakeOrder();

    public abstract boolean isMakeOrder();

    public abstract boolean isTakeOrder();

    String getName(){

        return this.name;
    }

    public Actor(String name){

        this.name = name;
    }

}
