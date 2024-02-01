package CreationalDesignPattern.Factory.UIFactory;

import CreationalDesignPattern.Factory.Button.AndroidButton;
import CreationalDesignPattern.Factory.Button.Button;
import CreationalDesignPattern.Factory.DropDown.AndroidDropDown;
import CreationalDesignPattern.Factory.DropDown.DropDown;
import CreationalDesignPattern.Factory.Menu.AndroidMenu;
import CreationalDesignPattern.Factory.Menu.Menu;

public class AndroidFactory implements UIFactory{

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
