package sr.unasat.foodDelivery.designPatterns.decorator;

public abstract class Products {
    String description = "normal";

    public String getdescription() {
        return description;
    }

    public abstract double price();
}
