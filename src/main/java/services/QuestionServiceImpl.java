package services;

import entities.Category;
import entities.Option;
import entities.Question;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuestionServiceImpl implements QuestionService {

    ArrayList<Question> questionsDB = new ArrayList<>();

    public void createQuestion(Question question) {
        questionsDB.add(question);
    }

    public void makeMigrations() {
        createQuestion(new Question("q1", "¿Cuanto es 1 + 5?", "c1"));
        createQuestion(new Question("q2", "¿Cual es la capital de Peru?", "c1"));
        createQuestion(new Question("q3", "¿En que continente esta Ecuador?", "c2"));
        createQuestion(new Question("q4", "¿Que tipo de Animal son las Ballenas?", "c2"));
        createQuestion(new Question("q5", "¿Cuales son los colores de la bandera de Peru?", "c3"));
        createQuestion(new Question("q6", "¿Cual es el primer planeta en el Sistema Solar?", "c3"));
    }

    public ArrayList<Question> getAllQuestions() {
        return questionsDB;
    }

    public Question getQuestionRandomByCategoryId(String categoryId) {
        int randomNumber;
        int minValue = 0;
        int maxValue = 2;
        randomNumber = (int) (Math.random() * (maxValue - minValue));

        ArrayList<Question> filteredList;
        filteredList = (ArrayList<Question>) questionsDB.stream()
                .filter(question -> question.getCategoryId().equals(categoryId))
                .collect(Collectors.toList());

        return filteredList.get(randomNumber);
    }
}
