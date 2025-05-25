package icecreamshop;

public abstract class IceCreamDecorator extends IceCreamComponents {
    protected IceCream decoratedIceCream;

    public IceCreamDecorator(IceCream decoratedIceCream){
        this.decoratedIceCream=decoratedIceCream;
    }

    @Override
    public void createIceCream() {
        super.createIceCream();
    }
}
