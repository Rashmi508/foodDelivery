package sr.unasat.foodDelivery.designPatterns.decorator;

public class HamBurgerCombo extends Products {


    public HamBurgerCombo() {
        description = "Ham burger with fries";
    }


    public double price() {
        return 56;
    }
}
