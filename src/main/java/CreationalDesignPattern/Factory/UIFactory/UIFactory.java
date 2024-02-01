package CreationalDesignPattern.Factory.UIFactory;
import CreationalDesignPattern.Factory.Button.Button;
import CreationalDesignPattern.Factory.Menu.Menu;
import CreationalDesignPattern.Factory.DropDown.DropDown;
//this is abstract factory as it has abstract factory methods(which doesn't have body or
// implementation)
//whereas AndroidFactory, WindowFactory etc. are concrete factories as they implement the UIFactory
//and UIFactoryFactory is the class for getting the concrete factory
public interface UIFactory {
    Menu createMenu();
    Button createButton();
    DropDown createDropDown();

}
