import entities.Category;
import entities.Option;
import entities.Question;
import services.CategoryServiceImpl;
import services.OptionServiceImpl;
import services.QuestionServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CategoryServiceImpl categoryService = new CategoryServiceImpl();
        categoryService.makeMigrations();

        OptionServiceImpl optionService = new OptionServiceImpl();
        optionService.makeMigrations();

        QuestionServiceImpl questionService = new QuestionServiceImpl();
        questionService.makeMigrations();

        System.out.println("Hola!, Ingrese su nombre: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hola" + name);

        Question question = questionService.getQuestionRandomByCategoryId("c1");
        System.out.println(question.getStatement());

        for (Option option: optionService.getOptionsById("q1")) {
            System.out.println(option.getAlternative() + ") " + option.getDetail());
        }

    }
}
