package org.example.HW2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human shopper = new Human();
        shopper.name = "Jason";
        Market shop = new Market();
        shop.update(shopper);
    }

}
