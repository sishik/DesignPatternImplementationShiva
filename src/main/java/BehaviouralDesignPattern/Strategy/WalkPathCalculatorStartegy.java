package BehaviouralDesignPattern.Strategy;

public class WalkPathCalculatorStartegy implements PathCalculatorStartegy{
    private static WalkPathCalculatorStartegy instance;

    private WalkPathCalculatorStartegy(){

    }

    public static WalkPathCalculatorStartegy getInstance() {
        if(instance == null) {
            synchronized (WalkPathCalculatorStartegy.class) {
                if (instance == null) {
                    instance = new WalkPathCalculatorStartegy();
                }
            }
        }
        return instance;
    }
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Walk Path from "+ source +" to "+destination);
    }
}
