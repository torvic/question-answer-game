package services;

import entities.Accumulated;

public interface AccumulatedService {
    Accumulated getOrCreateAccumulated(Accumulated accumulated);
}
