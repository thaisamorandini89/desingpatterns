package abstractFactory;

import abstractFactory.Button;
import abstractFactory.GUIFactory;

public class OSXFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new OSXButton();
    }
}
