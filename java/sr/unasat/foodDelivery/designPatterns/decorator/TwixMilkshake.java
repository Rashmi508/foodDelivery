package sr.unasat.foodDelivery.designPatterns.decorator;

public class TwixMilkshake extends ProductDecorator {

    public TwixMilkshake(Products products) {
        this.products = products;

    }


    public String getdescription() {
        return products.getdescription() + " with a twix milkshake";
    }

    @Override
    public double price() {
        return 45;
    }
}
