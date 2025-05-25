package icecreamshop;

public class IceCreamWithCSprinkles extends IceCreamDecorator{
    private String addTopping ;
    public IceCreamWithCSprinkles(IceCreamComponents decoratedIceCream, String topping){
        super(decoratedIceCream);
        addTopping=topping;
    }

    @Override
    public void createIceCream() {
        super.createIceCream();
        addTopping();

    }

    public void addTopping(){
        System.out.println( addTopping + "chocolate sprinkles");
    }
}

