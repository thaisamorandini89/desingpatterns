package abstractFactory;

import abstractFactory.Button;
import abstractFactory.GUIFactory;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }
}
