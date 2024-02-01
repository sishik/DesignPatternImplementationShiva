package CreationalDesignPattern.Factory.UIFactory;
import CreationalDesignPattern.Factory.Button.Button;
import CreationalDesignPattern.Factory.Menu.Menu;
import CreationalDesignPattern.Factory.DropDown.DropDown;

public interface UIFactory {
    Menu createMenu();
    Button createButton();
    DropDown createDropDown();

}
