package com.wipro.java.designpattern;

import com.wipro.java.designpattern.app.Application;
import com.wipro.java.designpattern.factory.GUIFactory;
import com.wipro.java.designpattern.factory.MacOSFactory;
import com.wipro.java.designpattern.factory.WindowsFactory;

public class Demo {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
