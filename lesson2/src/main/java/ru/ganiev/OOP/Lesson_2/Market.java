package ru.ganiev.OOP.Lesson_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private final List<Actor> queue;
    public Market(){
        this.queue = new ArrayList<>();
    }

    @Override
    public void takeInQueue(Actor actor){
        System.out.println(actor.getName() + " vstal(a) v ochered");
        this.queue.add(actor);
    }
    @Override
    public void takeOrders(){
        for (Actor actor: queue) {
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " sdelal(a) zakaz.");
            }
        }
    }
    @Override
    public void giveOrders(){
        for (Actor actor: queue) {
            System.out.println(actor.getName() + " poluchil(a) zakaz.");
            actor.setTakeOrder(true);
        }
    }
    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queue) {
            System.out.println(actor.getName() + " vishel(la) iz ocheredi.");
            releasedActors.add(actor);

        }
        releaseFromMarket(releasedActors);
    }


    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " prishel(la) v magazin.");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors) {
            System.out.println(actor.getName() + " vishel is magazina.");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

}
