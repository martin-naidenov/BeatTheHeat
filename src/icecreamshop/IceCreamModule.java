package icecreamshop;

public abstract class IceCreamModule {

    public abstract IceCreamComponents createIceCream(String flavour);

    public IceCreamComponents prepareIceCream(String flavour){
        IceCreamComponents iceCream=createIceCream(flavour);
        return iceCream;
    }

}
