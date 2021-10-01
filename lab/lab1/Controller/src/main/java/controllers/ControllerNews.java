package controllers;

import Typeofdata.News;
import modell.ModelInterface;
import modell.Modell;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;

public class ControllerNews implements InterfaceNewsController {
    private BisnesObjectNews bonews;
    @Inject
    private ModelInterface modell;

    public void setModell(Modell modell)
    {
        this.modell=modell;
    }
    public Modell getModell()
    {
        return (Modell) modell;
    }

    public ControllerNews(Modell model)
    {
     this.modell=model;
    }

    public ControllerNews(Object o)
    {
        modell=new Modell();
    }

    @Override
    public void addnewnew(String text)
    {
        this.modell.getNews().add(new BisnesObjectNews(text,"","",modell.getNews().size()));
    }

    @Override
    public BisnesObjectNews getnewbytext(String text)
    {


        else return null;
    }

    @Override
    public ArrayList<News> getnewslist()
    {
        return modell.getNews();
    }

    @Override
    public void newschange(int newsnum, String text)
    {
        modell.getNews().get(newsnum).setMaintext(text);
    }

    @Override
    public void deletenew(int num)
    {
        modell.getNews().remove(num);
    }
}

