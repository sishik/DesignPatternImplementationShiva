package BehaviouralDesignPattern.Strategy;

public class StrategyClient {
    public static void main(String[] args) {
        Map map = new Map();
        map.getPath("Patna","Delhi",TransportMode.CAR);
    }
}
