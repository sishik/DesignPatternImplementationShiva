package StructuralDesignPattern.Decorator;

public class OrangeCone implements IceCream{
    private IceCream iceCream;

    public OrangeCone(IceCream iceCream) {//this is for their is possibilty that icecream may have another cone before this
        this.iceCream = iceCream;
    }

    public OrangeCone() {//this constructor is for as orange cone can be base of ice cream and customer can only order cone
    }

    @Override
    public int getCost() {
        if(iceCream==null){//if this cone is base of icecream
            return 30;
        }
        else{
            return iceCream.getCost()+30;// if orange cone is added on top of other icecream cones base
        }
    }

    @Override
    public String getDescription() {
        if (iceCream==null){
            return "Orange Cone";
        }
        else{
            return iceCream.getDescription()+" "+"Orange Cone";
        }
    }
}
