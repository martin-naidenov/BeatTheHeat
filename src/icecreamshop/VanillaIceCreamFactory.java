package icecreamshop;

public class VanillaIceCreamFactory extends IceCreamModule{
    @Override
    public IceCreamComponents createIceCream(String typeIceCream) {
        if (typeIceCream.equals("Vanilla"))
            return new VanillaIceCream();

        return null;
    }
}
