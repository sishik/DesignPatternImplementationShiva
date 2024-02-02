package StructuralDesignPattern.Decorator;

public class ChocolateSyrup implements IceCream{
    private IceCream iceCream;

    public ChocolateSyrup(IceCream iceCream) {//this is for their is possibilty that icecream may have another cone before this
        this.iceCream = iceCream;
    }

//    public ChocolateSyrup() {//this constructor  we don't need here as customer can't order
//                                only chocolate syrup as icecream base
//    }

    @Override
    public int getCost() {
//        if(iceCream==null){//we don't need to check null here as it cannot be base so it wiill like add on on some icecream
//            return 30;
//        }
//        else{
            return iceCream.getCost()+30;
        //}
    }

    @Override
    public String getDescription() {//similarly here we don't need to check null for ice cream
//        if (iceCream==null){
//            return "Chocolate Syrup";
//        }
//        else{
            return iceCream.getDescription()+" "+"Chocolate Syrup";
       // }
    }
}
