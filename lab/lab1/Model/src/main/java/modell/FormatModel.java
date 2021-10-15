package modell;

import DAO.CategoryDao;
import DAO.NewsDao;
import DO.CategoryDo;
import DO.NewsDo;
import Provider.FormatProvider;

import java.util.List;

public class FormatModel extends ModelFactory{
    private FormatProvider provider;

    @Override
    public CategoryDao getCategoryDao() {
        provider = new FormatProvider();
        return new CategoryDao(provider);
    }

    @Override
    public NewsDao getNewsDao() {
        return null;
    }

    public List<CategoryDo> getNewsCategList(List<NewsDo> NewsDoList)
    {
        provider = new FormatProvider();
        NewsDao newsDao= new NewsDao(provider);
        CategoryDao categoryDao= new CategoryDao(provider);
    }

}
