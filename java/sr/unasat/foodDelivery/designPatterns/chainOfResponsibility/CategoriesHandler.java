package sr.unasat.foodDelivery.designPatterns.chainOfResponsibility;

public interface CategoriesHandler {

    void setNextCategoriesHandler(CategoriesHandler nextChain);

    void check(Categories categories);

    default void validate(Categories categories) {
        if (categories == null || categories.getName() == null) {
            System.out.println();
            return;
        }
    }
}
