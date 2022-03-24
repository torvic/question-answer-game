package services;

import entities.Accumulated;
import entities.Question;
import entities.Round;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class RoundServiceImpl implements RoundService {

    ArrayList<Round> roundDB = new ArrayList<>();

    public Round createRound(Round round) {
        roundDB.add(round);
        return round;
    }

    public ArrayList<Round> getRoundsByAccumulatedId(String accumulatedId) {

        ArrayList<Round> filteredList;
        filteredList = (ArrayList<Round>) roundDB.stream()
                .filter(round -> round.getAccumulatedId().equals(accumulatedId))
                .collect(Collectors.toList());

        return filteredList;
    }

}
