package icecreamshop;

public class StrawberryIceCreamFactory extends IceCreamModule{

    @Override
    public IceCreamComponents createIceCream(String typeIceCream) {
        if (typeIceCream.equals("Strawberry"))
            return new StrawberryIceCream();

        return null;
    }
}
