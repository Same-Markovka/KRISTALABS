package Facade;

import DO.CategoryDo;
import DO.NewsDo;
import controllers.ControllerCategories;
import controllers.ControllerNews;
import controllers.InterfaceCategoryController;
import controllers.InterfaceNewsController;
import modell.ModelFactory;

import javax.inject.Inject;
import java.util.ArrayList;

public class Facade implements  FacadeInteface{

    @Inject
    private InterfaceNewsController controllerNews;

    @Inject
    private InterfaceCategoryController controllercategories;

    @Inject
    private ModelFactory modelFactory;
//    public ControllerNews getControllerNews() {
//        return (ControllerNews) controllerNews;
//    }

    public Facade()
    {

        controllerNews=new ControllerNews(modelFactory);
        controllercategories=new ControllerCategories(modelFactory);
        //System.out.println(currentdateformat.format(currentdate));
    }



}
