package sr.unasat.foodDelivery.designPatterns.decorator;

public class OreoMilkshake extends ProductDecorator {

    public OreoMilkshake (Products products) {
        this.products = products;
    }


    public String getdescription() {
        return products.getdescription() + " with an oreo milkshake";
    }


    public double price() {
        return products.price() + 45;
    }
}
