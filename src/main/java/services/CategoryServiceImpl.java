package services;

import entities.Category;
import entities.Option;

import java.util.ArrayList;

public class CategoryServiceImpl implements CategoryService{

    ArrayList<Category> categoryDB = new ArrayList<>();

    public void createCategory(Category category) {
        categoryDB.add(category);
    }

    public void makeMigrations() {
        createCategory(new Category("c1", "Muy Facil", 100));
        createCategory(new Category("c2", "Facil", 200));
        createCategory(new Category("c3", "Normal", 300));
        createCategory(new Category("c4", "Dificil", 400));
        createCategory(new Category("c5", "Muy Dificil", 500));
    }
}
