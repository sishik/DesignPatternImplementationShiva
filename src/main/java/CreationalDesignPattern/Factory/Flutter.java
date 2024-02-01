package CreationalDesignPattern.Factory;

import CreationalDesignPattern.Factory.SupportedPlatform.SupportedPlatform;
import CreationalDesignPattern.Factory.UIFactory.UIFactory;
import CreationalDesignPattern.Factory.UIFactory.UIFactoryFactory;

public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }
    public void setTheme(){
        System.out.println("Setting theme for Flutter");
    }
    public void setFont(){
        System.out.println("Setting font for Flutter");
    }
    public void setIcon(){
        System.out.println("Setting icon for Flutter");
    }
    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(supportedPlatform);
    }
}
