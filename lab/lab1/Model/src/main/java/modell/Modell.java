package modell;

import Typeofdata.News;
import controllers.BisnesObjectCategory;
import controllers.BisnesObjectNews;

import java.util.ArrayList;

public class Modell implements ModelInterface{
    private ArrayList<BisnesObjectNews> news;
    private ArrayList<BisnesObjectCategory> categories;

    public Modell() {
        news = new ArrayList<>();
        categories = new ArrayList<>();
    }
    @Override
    public ArrayList<BisnesObjectNews> getNews() {
        return news;
    }

    @Override
    public void setNews(ArrayList<BisnesObjectNews> news) {
        this.news = news;
    }

    @Override
    public ArrayList<BisnesObjectCategory> getCategories() {
        return categories;
    }

    @Override
    public void setCategories(ArrayList<BisnesObjectCategory> categories) {
        this.categories = categories;
    }
}


