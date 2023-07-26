package ru.ganiev.OOP.Lesson_2;
public class Human  extends Actor{

    public Human(String name){
        super(name);

    }
    @Override
    public void setMakeOrder() {

    }

    @Override
    public void setTakeOrder() {

    }

    @Override
    public boolean isMakeOrder() {

        return false;
    }

    @Override
    public boolean isTakeOrder() {

        return false;
    }

    @Override
    String getName() {

        return super.getName();
    }
}
