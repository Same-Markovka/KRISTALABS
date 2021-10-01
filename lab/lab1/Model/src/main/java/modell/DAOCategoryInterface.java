package modell;

import controllers.BisnesObjectCategory;

import java.util.ArrayList;

public interface DAOCategoryInterface {
    default ArrayList<BisnesObjectCategory> getall() {
        return null;
    }

    default BisnesObjectCategory getbyid(int id) {
        return null;
    }

    default void changebyid(String message,int id) {

    }
    default void addbyid(BisnesObjectCategory bisnesObjectCategory)
    {

    }
    default void deletebyid(int id)
    {

    }
}
