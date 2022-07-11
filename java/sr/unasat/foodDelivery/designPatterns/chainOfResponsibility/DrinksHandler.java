package sr.unasat.foodDelivery.designPatterns.chainOfResponsibility;

public class DrinksHandler implements CategoriesHandler{

    private CategoriesHandler nextCategoriesHandler;

    @Override
    public void setNextCategoriesHandler(CategoriesHandler nextCategoriesHandler) {
        this.nextCategoriesHandler = nextCategoriesHandler;

    }

    @Override
    public void check(Categories categories) {

        if (categories == null || categories.getName() == null) {


        } else {
            this.nextCategoriesHandler.check(categories);
        }

    }
}
