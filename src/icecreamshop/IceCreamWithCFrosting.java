package icecreamshop;

public class IceCreamWithCFrosting extends IceCreamDecorator{
    private String addTopping ;
    public IceCreamWithCFrosting(IceCreamComponents decoratedIceCream, String topping){
        super(decoratedIceCream);
        addTopping=topping;
    }

    @Override
    public void createIceCream() {
        super.createIceCream();
        addTopping();

    }

    public void addTopping(){
        System.out.println( addTopping + "chocolate frosting");
    }
}
