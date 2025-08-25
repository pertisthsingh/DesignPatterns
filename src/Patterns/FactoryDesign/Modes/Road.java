package Patterns.FactoryDesign.Modes;

import Patterns.FactoryDesign.Logistics;

public class Road implements Logistics {
    @Override
    public void send() {
        System.out.println("Road sends to Logistics");
    }
}
