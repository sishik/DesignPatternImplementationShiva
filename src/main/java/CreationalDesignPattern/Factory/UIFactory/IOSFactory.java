package CreationalDesignPattern.Factory.UIFactory;

import CreationalDesignPattern.Factory.Button.Button;
import CreationalDesignPattern.Factory.Button.IOSButton;
import CreationalDesignPattern.Factory.DropDown.DropDown;
import CreationalDesignPattern.Factory.DropDown.IOSDropDown;
import CreationalDesignPattern.Factory.Menu.IOSMenu;
import CreationalDesignPattern.Factory.Menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
