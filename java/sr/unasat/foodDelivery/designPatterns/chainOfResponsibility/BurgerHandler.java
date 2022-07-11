package sr.unasat.foodDelivery.designPatterns.chainOfResponsibility;

import static sr.unasat.foodDelivery.designPatterns.chainOfResponsibility.CouchConstant.BURGER;

public class BurgerHandler implements CategoriesHandler{

    private  CategoriesHandler nextCategoriesHandler;

    @Override
    public  void setNextCategoriesHandler(CategoriesHandler nextCategoriesHandler) {
        this.nextCategoriesHandler = nextCategoriesHandler;

    }

    @Override
    public void check(Categories categories) {

        if (categories == null || categories.getName() == null) {
            System.out.println();

        } if (BURGER.equalsIgnoreCase(categories.getName())) {


        }

        else {
            this.nextCategoriesHandler.check(categories);
        }


    }
}
