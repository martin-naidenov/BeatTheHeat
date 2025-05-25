package icecreamshop;

public class ChocolateIceCreamFactory extends IceCreamModule {

    @Override
    public IceCreamComponents createIceCream(String typeIceCream) {
        if (typeIceCream.equals("Chocolate"))
            return new ChocolateIceCream();

        return null;
    }
}
