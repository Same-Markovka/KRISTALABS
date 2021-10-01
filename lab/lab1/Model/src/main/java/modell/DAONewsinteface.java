package modell;

import controllers.BisnesObjectNews;

import java.util.ArrayList;

public interface DAONewsinteface {
    default ArrayList<BisnesObjectNews> getall() {
        return null;
    }

    default BisnesObjectNews getbyid(int id){
        return null;
    }

    default void changebyid(int id)
    {

    }
    default void addbyid(BisnesObjectNews bonews)
    {

    }
    default void deletebyid(int id)
    {

    }
}
