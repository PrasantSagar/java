package com.wipro.java.designpattern.factory;

import com.wipro.java.designpattern.buttons.Button;
import com.wipro.java.designpattern.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
