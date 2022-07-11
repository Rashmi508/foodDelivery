package sr.unasat.foodDelivery.designPatterns.chainOfResponsibility;

public class CategoriesChain {

    public static CategoriesHandler firstCategoriesHandler;

    public CategoriesChain() {

        JavaneseHandler javaneseHandler = new JavaneseHandler();
        DrinksHandler drinksHandler = new DrinksHandler();
        BurgerHandler burgerHandler = new BurgerHandler();
        burgerHandler.setNextCategoriesHandler(javaneseHandler);
        drinksHandler.setNextCategoriesHandler(burgerHandler);
        this.firstCategoriesHandler = drinksHandler;
    }

//    public void getChain() {
//
//        CategoriesChain cc = new CategoriesChain();
//        Categories categories = new Categories("Burger");
//        cc.firstCategoriesHandler.check(categories);
//    }
}
