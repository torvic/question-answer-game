package services;

import entities.Accumulated;
import entities.Round;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class AccumulatedServiceImpl implements AccumulatedService {

    ArrayList<Accumulated> accumulatedDB = new ArrayList<>();

    public Accumulated getOrCreateAccumulated(Accumulated accumulated) {
        // get accumulated
        ArrayList<Accumulated> filteredList;
        filteredList = (ArrayList<Accumulated>) accumulatedDB.stream()
                .filter(pastAccumulated -> pastAccumulated.getId().equals(accumulated.getId()))
                .collect(Collectors.toList());

        if (filteredList.size() == 0) {
            accumulatedDB.add(accumulated);
            return accumulated;
        }

        return filteredList.get(0);


        // create
    }

    public void getScoreByAccumulatedId(String accumulatedId,RoundServiceImpl roundService, CategoryServiceImpl categoryService) {
        ArrayList<Round> rounds = roundService.getRoundsByAccumulatedId(accumulatedId);
        System.out.println("aqui en get score");
        System.out.println(rounds);
        rounds
                .forEach(round -> System.out.println(categoryService.getCategoryByQuestionId(round.getQuestionId()).getScore()));
    }
}
