package org.example.HW2;

public abstract class Consumer implements ConsumerBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public abstract String getName();

}
