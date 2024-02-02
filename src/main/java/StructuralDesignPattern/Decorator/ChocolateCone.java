package StructuralDesignPattern.Decorator;

public class ChocolateCone implements IceCream{
    private IceCream iceCream;

    public ChocolateCone(IceCream iceCream) {//this is for their is possibilty that icecream may have another cone before this
        this.iceCream = iceCream;
    }

    public ChocolateCone() {//this constructor is for as orange cone can be base of ice cream and customer can only order cone
    }

    @Override
    public int getCost() {
        if(iceCream==null){//if this cone is base of icecream
            return 40;
        }
        else{
            return iceCream.getCost()+40;// if orange cone is added on top of other icecream cones base
        }
    }

    @Override
    public String getDescription() {
        if (iceCream==null){
            return "Chocolate Cone";
        }
        else{
            return iceCream.getDescription()+" "+"Chocolate Cone";
        }
    }
}
