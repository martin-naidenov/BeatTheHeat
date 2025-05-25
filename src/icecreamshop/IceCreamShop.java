package icecreamshop;

import java.util.Scanner;

public class IceCreamShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flavour = scan.nextLine();

        switch (flavour)
        {
            case "Vanilla":
            IceCreamModule iceCreamFactory = new VanillaIceCreamFactory();
            IceCreamComponents vanillaIceCream = iceCreamFactory.prepareIceCream(flavour);
                System.out.println("Ice cream order = " + vanillaIceCream.flavour);
            break;
            case "Chocolate":
            iceCreamFactory = new ChocolateIceCreamFactory();
            IceCreamComponents chocolateIceCream = iceCreamFactory.prepareIceCream(flavour);
                System.out.println("Ice cream order = " + chocolateIceCream.flavour);
            break;
            case "Strawberry":
            iceCreamFactory = new StrawberryIceCreamFactory();
            IceCreamComponents strawberryIceCream = iceCreamFactory.prepareIceCream(flavour);
                System.out.println("Ice cream order = " + strawberryIceCream.flavour);
            break;

        }

    }
}
