package abstractFactory;

import abstractFactory.Application;

import java.util.Scanner;

public class ApplicationRunner {
    public static void main(String[] args){
        new Application(createOsSpecificationFactory());
    }

    private static GUIFactory createOsSpecificationFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if(sys == 0){
            return new WinFactory();
        } else {
            return  new OSXFactory();
        }
    }

    private static int readFromConfigFile(String osType) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qual sistema operacional você quer implantar a aplicação");
        System.out.println("0 - Windows");
        System.out.println("1 - Mac");

        int osTypeDefined = scanner.nextInt();

        return osTypeDefined;
    }
}
