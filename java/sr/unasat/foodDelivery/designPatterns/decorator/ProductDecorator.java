package sr.unasat.foodDelivery.designPatterns.decorator;

public abstract class ProductDecorator extends Products {

    Products products;

    public abstract String getdescription();

    public abstract double price();
}
