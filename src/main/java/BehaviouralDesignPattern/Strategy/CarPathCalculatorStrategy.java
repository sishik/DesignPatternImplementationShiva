package BehaviouralDesignPattern.Strategy;

public class CarPathCalculatorStrategy implements PathCalculatorStartegy{
    private static CarPathCalculatorStrategy instance;
    private CarPathCalculatorStrategy(){

    }
    public static CarPathCalculatorStrategy getInstance(){
        if(instance==null){
            synchronized (CarPathCalculatorStrategy.class){
                if (instance==null){
                    instance=new CarPathCalculatorStrategy();
                }
            }
        }
        return CarPathCalculatorStrategy;
    }
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Car path from "+ source +" to "+"destination");
    }
}
