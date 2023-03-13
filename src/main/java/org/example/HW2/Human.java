package org.example.HW2;

import java.util.Scanner;

public class Human extends Consumer{
    @Override
    public String getName() {
        return name;
    }

    @Override
    public  void setMakeOrder(){
        super.isMakeOrder = true;
    }
    @Override
    public  void setTakeOrder(){
        super.isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

}
