package Patterns.FactoryDesign;

import Patterns.FactoryDesign.Modes.Air;
import Patterns.FactoryDesign.Modes.Road;

public class LogisticsFactory {
    public static Logistics getLogistics(String mode){
        if(mode.equalsIgnoreCase("Road")){
            return new Road();
        }
        else {
            return new Air();
        }
    }
}
