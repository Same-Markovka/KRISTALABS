package Facade;

import Typeofdata.News;
import controllers.ControllerCategories;
import controllers.ControllerNews;
import controllers.InterfaceCategoryController;
import controllers.InterfaceNewsController;
import modell.Modell;

import javax.inject.Inject;
import java.util.ArrayList;

public class Facade implements  FacadeInteface{

    @Inject
    private InterfaceNewsController controllerNews;

    @Inject
    private InterfaceCategoryController controllercategories;

//    public ControllerNews getControllerNews() {
//        return (ControllerNews) controllerNews;
//    }

    public Facade()
    {
        Modell modell=new Modell();
        controllerNews=new ControllerNews(modell);
        controllercategories=new ControllerCategories(modell);
        //System.out.println(currentdateformat.format(currentdate));
    }
    public Facade(Modell modell){
        controllerNews=new ControllerNews(modell);
        controllercategories=new ControllerCategories(modell);
    }

    @Override
    public void addnewnew(String line) {
        controllerNews.addnewnew(line);
    }

    @Override
    public News getnewbyname(String line)
    {
        return controllerNews.getnewbytext(line);
    }

    @Override
    public ArrayList<News> getnewslist(){
        return controllerNews.getnewslist();
    }

}
