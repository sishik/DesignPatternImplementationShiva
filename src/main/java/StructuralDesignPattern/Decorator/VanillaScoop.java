package StructuralDesignPattern.Decorator;
//Simmilarly In this vanilla scoop class we don't need to check null for ice cream as
//it cannot be base so it wiill like add on on some icecream cone(like vanilla cone ,chocolate cone etc).
public class VanillaScoop implements IceCream{
    private IceCream iceCream;

    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+30;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+" "+"Vanilla Scoop";
    }
}
