package StructuralDesignPattern.Decorator;

class DecoratorClient {
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateChip(new ChocolateSyrup(new VanillaScoop(new ChocolateScoop(new VanillaCone()))));
        System.out.println("Cost: "+iceCream.getCost());
        System.out.println("Description: "+iceCream.getDescription());
    }
}
