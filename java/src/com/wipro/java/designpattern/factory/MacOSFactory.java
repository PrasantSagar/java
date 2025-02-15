package com.wipro.java.designpattern.factory;

import com.wipro.java.designpattern.buttons.Button;
import com.wipro.java.designpattern.buttons.MacOSButton;
import com.wipro.java.designpattern.checkboxes.Checkbox;
import com.wipro.java.designpattern.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
