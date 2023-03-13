package org.example.HW2;

public interface MarketBehaviour {
    void enterMarket(Consumer consumer);
    void leaveMarket(Consumer consumer);
    void update();
}
