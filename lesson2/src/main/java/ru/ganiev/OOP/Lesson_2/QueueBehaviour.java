package ru.ganiev.OOP.Lesson_2;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders();

    void giveOrders();
    void releaseFromQueue();
}
