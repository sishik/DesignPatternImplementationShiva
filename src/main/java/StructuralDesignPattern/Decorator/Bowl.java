package StructuralDesignPattern.Decorator;

public class Bowl implements IceCream{
    public Bowl() {//as this can only be base so we don't need icecream interface here

    }

    @Override
    public int getCost() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Bowl";
    }
}
