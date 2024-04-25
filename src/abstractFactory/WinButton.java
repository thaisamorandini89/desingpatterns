package abstractFactory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("I'm a WinButton");
    }
}
