package CreationalDesignPattern.Factory.UIFactory;

import CreationalDesignPattern.Factory.SupportedPlatform.SupportedPlatform;

//class to call the factory methods
public class UIFactoryFactory {
    public static UIFactory createUIFactory(SupportedPlatform platform){
        return switch(platform){
            case ANDROID-> new AndroidFactory();
            case IOS->  new IOSFactory();
            case WINDOWS-> new WindowFactory();
        };
    }
}
