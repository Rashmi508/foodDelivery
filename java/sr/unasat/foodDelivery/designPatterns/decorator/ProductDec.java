package sr.unasat.foodDelivery.designPatterns.decorator;

public class ProductDec {

    public void getDecorator() {

        Products kipBurger = new KipBurgerCombo();
        Products hamBurger = new HamBurgerCombo();
        Products kipMetOreo = new OreoMilkshake(kipBurger);
        Products hamMetOreo = new OreoMilkshake(hamBurger);
        Products kipMetTwix = new TwixMilkshake(kipBurger);
        Products hamMetTwix = new TwixMilkshake(hamBurger);

        System.out.println("Chicken Burger with fries and oreo milkshake: " + kipMetOreo.getdescription()
                + " \n Total price: SRD" + kipMetOreo.price());

        System.out.println("Chicken Burger with fries and twix milkshake: " + kipMetTwix.getdescription()
                + " \n Total price: SRD" + kipMetTwix.price());

        System.out.println("Ham Burger with fries and oreo milkshake: " + hamMetOreo.getdescription()
                + " \n Total price: SRD" + hamMetOreo.price());

        System.out.println("Ham Burger with fries and twix milkshake: " + hamMetTwix.getdescription()
                + " \n Total price: SRD" + hamMetTwix.price());
    }
}
