package controllers;

import Typeofdata.News;

import java.util.ArrayList;

public interface InterfaceNewsController {

    default void addnewnew(String text) {}

    default News getnewbytext(String text) {
        return null;
    }

    default ArrayList<News> getnewslist() {
        return null;
    }

    default void newschange(int newsnum, String text) {

    }

    default void deletenew(int num) {

    }

}
