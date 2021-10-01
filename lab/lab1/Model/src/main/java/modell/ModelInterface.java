package modell;

import Typeofdata.News;
import controllers.BisnesObjectCategory;
import controllers.BisnesObjectNews;

import java.util.ArrayList;

public interface ModelInterface {
    default ArrayList<BisnesObjectNews> getNews(){
        return null;
    }

    default void setNews(ArrayList<BisnesObjectNews> news) {

    }

    default ArrayList<BisnesObjectCategory> getCategories() {
        return null;
    }

    default void setCategories(ArrayList<BisnesObjectCategory> categories) {
    }
}
