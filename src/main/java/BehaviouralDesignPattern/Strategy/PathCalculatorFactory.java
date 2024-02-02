package BehaviouralDesignPattern.Strategy;
public class PathCalculatorFactory {
    public static PathCalculatorStartegy getPathCalculator(TransportMode mode){
        return switch (mode){
            case TransportMode.CAR-> CarPathCalculatorStrategy.getInstance();
            case TransportMode.BIKE -> BikepathCalculatorStrategy.getInstance();
            case TransportMode.WALK -> WalkPathCalculatorStartegy.getInstance();
        };
    }
}
