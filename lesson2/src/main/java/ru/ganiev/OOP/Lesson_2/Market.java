package ru.ganiev.OOP.Lesson_2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private final List<Actor> queue;
    public Market(){
        this.queue = new ArrayList<>();
    }

    @Override
    public void takeInQueue(Actor actor){

    }


    @Override
    public void acceptToMarket(Actor actor) {

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {

    }

    @Override
    public void update() {

    }
}
