package StructuralDesignPattern.Decorator;

public class VanillaCone implements IceCream{
    private IceCream iceCream;

    public VanillaCone(IceCream iceCream) {//this is for their is possibilty that icecream may have another cone before this
        this.iceCream = iceCream;
    }

    public VanillaCone() {//this constructor is for as orange cone can be base of ice cream and customer can only order cone
    }

    @Override
    public int getCost() {
        if(iceCream==null){//if this cone is base of icecream
            return 20;
        }
        else{
            return iceCream.getCost()+20;// if orange cone is added on top of other icecream cones base
        }
    }

    @Override
    public String getDescription() {
        if (iceCream==null){
            return "Vanilla Cone";
        }
        else{
            return iceCream.getDescription()+" "+"Vanilla Cone";
        }
    }
}
