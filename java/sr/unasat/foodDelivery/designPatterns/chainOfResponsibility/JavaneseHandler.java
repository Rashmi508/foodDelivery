package sr.unasat.foodDelivery.designPatterns.chainOfResponsibility;

import static sr.unasat.foodDelivery.designPatterns.chainOfResponsibility.CouchConstant.JAVANESE;

public class JavaneseHandler implements CategoriesHandler{

    private CategoriesHandler CategoriesHandler;

    @Override
    public void setNextCategoriesHandler(CategoriesHandler CategoriesHandler) {
        this.CategoriesHandler = CategoriesHandler;
    }

    @Override
    public void check(Categories categories) {
        if (categories == null || categories.getName() == null) {
            System.out.println();

        } if (JAVANESE.equalsIgnoreCase(categories.getName())) {


        } else {
            this.CategoriesHandler.check(categories);
        }


    }
}
