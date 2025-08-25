package Patterns.FactoryDesign.Modes;

import Patterns.FactoryDesign.Logistics;

public class Air implements Logistics {
    @Override
    public void send() {
        System.out.println("Air sends to Logistics");
    }
}
