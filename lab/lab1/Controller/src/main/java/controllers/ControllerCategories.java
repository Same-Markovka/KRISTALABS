package controllers;

import modell.DAOCategory;
import modell.Modell;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;

public class ControllerCategories implements InterfaceCategoryController {
    DAOCategory dao;

    private Singleton singleton;

    BisnesObjectCategory bocategory;
    public ControllerCategories()
    {
        dao=new DAOCategory();
        singleton=Singleton.getInstance(dao.getall());
    }
    public ControllerCategories(DAOCategory dao)
    {
       this.dao=dao;
        singleton=Singleton.getInstance(dao.getall());
    }
    @Override
    public int categoryfindbyname(String name) {
       
       else  return -1;
    }

    @Override
    public ArrayList<BisnesObjectCategory> returnallcategories() {
        return model.getCategories();
    }

    /*@Override
    public void addcategory(BisnesObjectCategory category) {
        model.getCategories().add(category);
    }

    @Override
    public void categorychange(int catnum,String category) {
        model.getCategories().set(catnum,category);
    }

    @Override
    public void categorydelete(int catnum) {
        model.getCategories().remove(catnum);
    }*/

}

