package CreationalDesignPattern.Factory.UIFactory;

import CreationalDesignPattern.Factory.Button.Button;
import CreationalDesignPattern.Factory.Button.WindowButton;
import CreationalDesignPattern.Factory.DropDown.DropDown;
import CreationalDesignPattern.Factory.DropDown.WindowDropDown;
import CreationalDesignPattern.Factory.Menu.Menu;
import CreationalDesignPattern.Factory.Menu.WindowMenu;

public class WindowFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new WindowMenu();
    }

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowDropDown();
    }
}
