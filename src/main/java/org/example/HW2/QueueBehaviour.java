package org.example.HW2;

public interface QueueBehaviour {
    void takeInQueue(Consumer consumer);
    void takeOrders();
    void giveOrders();
    void replaceFromQueue();

    void enterMarket(Consumer consumer);

    void leaveMarket(Consumer consumer);

    void update();
}
