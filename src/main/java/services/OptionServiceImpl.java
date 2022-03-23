package services;

import entities.Option;
import entities.Question;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class OptionServiceImpl implements OptionService {

    ArrayList<Option> optionsDB = new ArrayList<>();

    public void createOption(Option option) {
        optionsDB.add(option);
    }

    public ArrayList<Option> getOptionsById(String questionId) {
        ArrayList<Option> filteredList;

        filteredList = (ArrayList<Option>) optionsDB.stream()
                .filter(option -> option.getQuestionId().equals(questionId))
                .collect(Collectors.toList());

        return filteredList;
    }

    public void makeMigrations() {
        createOption(new Option(1, "6", true, "q1"));
        createOption(new Option(2, "51", false, "q1"));
        createOption(new Option(3, "4", false, "q1"));
        createOption(new Option(4, "5 + 1", false, "q1"));

        createOption(new Option(1, "Arequipa", false, "q2"));
        createOption(new Option(2, "Piura", false, "q2"));
        createOption(new Option(3, "Lima", true, "q2"));
        createOption(new Option(4, "Buenos Aires", false, "q2"));

        createOption(new Option(1, "Oceania", false, "q3"));
        createOption(new Option(2, "Europa", false, "q3"));
        createOption(new Option(3, "America", true, "q3"));
        createOption(new Option(4, "Austria", false, "q3"));

    }
}
