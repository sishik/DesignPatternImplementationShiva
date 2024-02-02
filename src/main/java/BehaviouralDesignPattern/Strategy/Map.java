package BehaviouralDesignPattern.Strategy;

public class Map {
    public void getPath(String source, String destination, TransportMode mode){
        PathCalculatorStartegy pathCalculatorStartegy = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculatorStartegy.findPath(source, destination);
    }
}
