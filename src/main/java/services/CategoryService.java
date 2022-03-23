package services;

import entities.Category;

public interface CategoryService {
    void createCategory(Category category);
    void makeMigrations();
}
