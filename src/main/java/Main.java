import entities.*;
import services.*;

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

        System.out.println("Hola " + name + ", iniciemos el juego :)");
        System.out.println("Presione 0 en cualquier ronda para poder retirarse con el premio acumulado");
        System.out.println();

        // app
        boolean aux = true;
        int roundNumber = 1;
        int score = 0;


        Question question = questionService.getQuestionRandomByCategoryId("c1");
        System.out.println(question.getStatement());
        System.out.println("Por favor ingrese un numero de las siguientes opciones: ");

        for (Option option: optionService.getOptionsByQuestionId(question.getId())) {
            System.out.println(option.getAlternative() + ") " + option.getDetail());
        }

        System.out.println("Dificultad: " + categoryService.getCategoryById("c1").getName());
        System.out.print("Respuesta: ");
        int answer = Integer.parseInt(scanner.nextLine());
        if (optionService.getOptionByQuestionIdAndAlternative(question.getId(), answer).getCorrect()) {
            // create accumulated
            AccumulatedServiceImpl accumulatedService = new AccumulatedServiceImpl();
            Accumulated accumulated = accumulatedService.getOrCreateAccumulated(new Accumulated("a1", "u1", false));
            // create round entity
            RoundServiceImpl roundService = new RoundServiceImpl();
            Round round = roundService.createRound(new Round(question.getId(), accumulated.getId()));

            System.out.println("acumulado");
            System.out.println(accumulated.getId() + accumulated.getPlayerId() + accumulated.getComplete());

            System.out.println("ronda");
            System.out.println(round.getQuestionId() + round.getAccumulatedId());

            // calculated score by accumulated id
            score = score + categoryService.getCategoryById("c1").getScore();
            System.out.println("score: " + score);


            System.out.println("Felicidades, pasas a la siguiente ronda");
            //
        } else {
            System.out.println("Suerte en la proxima");
            // update accumulated to isComplete true
        }


    }
}
