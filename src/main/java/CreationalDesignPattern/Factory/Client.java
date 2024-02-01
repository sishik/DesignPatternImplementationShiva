package CreationalDesignPattern.Factory;

import CreationalDesignPattern.Factory.Button.Button;
import CreationalDesignPattern.Factory.DropDown.DropDown;
import CreationalDesignPattern.Factory.Menu.Menu;
import CreationalDesignPattern.Factory.SupportedPlatform.SupportedPlatform;
import CreationalDesignPattern.Factory.UIFactory.UIFactory;

public class Client {
    public static void main(String[] args){
        Flutter flutter = new Flutter(SupportedPlatform.WINDOWS);
        UIFactory uiFactory = flutter.createUIFactory();
        Menu menu = uiFactory.createMenu();
        Button button = uiFactory.createButton();
        DropDown dropDown = uiFactory.createDropDown();
        System.out.println("Flutter for Android");
    }
}
