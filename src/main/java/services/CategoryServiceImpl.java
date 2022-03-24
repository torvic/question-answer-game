package services;

import entities.Category;
import entities.Option;
import entities.Question;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CategoryServiceImpl implements CategoryService{

    ArrayList<Category> categoryDB = new ArrayList<>();

    public void createCategory(Category category) {
        categoryDB.add(category);
    }

    public Category getCategoryById(String categoryId) {
        ArrayList<Category> filteredList;

        filteredList = (ArrayList<Category>) categoryDB.stream()
                .filter(category -> category.getId().equals(categoryId))
                .collect(Collectors.toList());

        return filteredList.get(0);
    }

    public Category getCategoryByQuestionId(String questionId) {
        QuestionServiceImpl questionService = new QuestionServiceImpl();
        Question question = questionService.getQuestionById(questionId);
        return getCategoryById(question.getCategoryId());
    }

    public void makeMigrations() {
        createCategory(new Category("c1", "Muy Facil", 100));
        createCategory(new Category("c2", "Facil", 200));
        createCategory(new Category("c3", "Normal", 300));
        createCategory(new Category("c4", "Dificil", 400));
        createCategory(new Category("c5", "Muy Dificil", 500));
    }
}
