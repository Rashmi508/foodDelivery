package sr.unasat.foodDelivery.designPatterns.decorator;

public class KipBurgerCombo extends Products{

    public KipBurgerCombo() {
        description = "Chicken burger with fries";
    }


    public double price() {
        return 55;
    }
}
