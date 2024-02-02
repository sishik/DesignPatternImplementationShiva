package BehaviouralDesignPattern.Strategy;

public class BikepathCalculatorStrategy implements PathCalculatorStartegy{
    private static BikepathCalculatorStrategy instance;
    private BikepathCalculatorStrategy(){

    }
    public static BikepathCalculatorStrategy getInstance(){
        if(instance==null){
            synchronized (BikepathCalculatorStrategy.class){
                if (instance==null){
                    instance=new BikepathCalculatorStrategy();
                }
            }
        }
        return BikepathCalculatorStrategy;
    }
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Bike Path from "+ source +" to "+destination);
    }
}
