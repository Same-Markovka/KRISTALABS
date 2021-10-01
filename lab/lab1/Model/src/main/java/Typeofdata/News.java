package Typeofdata;

public class News {
    private String maintext;

//    public void setNewnum(int newnum) {
//        this.newnum = newnum;
//    }

//    public int getNewnum() {
//        return newnum;
//    }

    public String getMaintext() {
        return maintext;
    }

    public void setMaintext(String maintext) {
        this.maintext = maintext;
    }


    public News(String newstext) {
        maintext = newstext;
    }

    News() {
        maintext = "";
    }

}
