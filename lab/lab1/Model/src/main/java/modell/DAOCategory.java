package modell;

import controllers.BisnesObjectCategory;

import javax.inject.Inject;
import java.util.ArrayList;

public class DAOCategory implements DAOCategoryInterface{
    @Inject
    private ModelInterface model;

    @Override
    public ArrayList<BisnesObjectCategory> getall() {
        return model.getCategories();
    }

    @Override
    public BisnesObjectCategory getbyid(int id) {
        return model.getCategories().get(id);
    }

    @Override
    public void changebyid(String name,int id) {
        model.getCategories().get(id).setName(name);
    }

    @Override
    public void addbyid(BisnesObjectCategory bonews)
    {
        model.getCategories().add(bonews);
    }
    public void deletebyid(int id)
    {
        model.getCategories().remove(id);
    }

}
