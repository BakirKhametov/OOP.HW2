package org.example.HW2;

import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour {
    List<Consumer> consumers = new ArrayList<>();
    Queue<Consumer> consumersQueue = new ArrayDeque<>();

    @Override
    public void enterMarket(Consumer consumer) {
        System.out.println(consumer.getName() + " вошёл в магазин");
        consumers.add(consumer);
    }

    @Override
    public void leaveMarket(Consumer consumer) {
        System.out.println(consumer.getName() + " покинул магазин");
        consumers.remove(0);
    }

    @Override
    public void update() {

    }

    public void update (Consumer consumer) {
        enterMarket(consumer);
        takeInQueue(consumer);
        takeOrders();
        giveOrders();
        replaceFromQueue();
        leaveMarket(consumer);
    }

    @Override
    public void takeInQueue(Consumer consumer) {
        System.out.println(consumer.getName() + " встал в очередь");
        consumersQueue.add(consumer);
    }

    @Override
    public void takeOrders() {
        consumersQueue.element().isTakeOrder();
        System.out.println(consumersQueue.element().getName() + " оформил заказ");
    }

    @Override
    public void giveOrders() {
        consumersQueue.element().setMakeOrder();
        System.out.println(consumersQueue.element().getName() + " забрал заказ");

    }

    @Override
    public void replaceFromQueue() {
        System.out.println(consumersQueue.poll().getName() + " покинул очередь");
    }
}
