package services;

import entities.Option;

public interface OptionService {
    void createOption(Option option);
    void makeMigrations();
}
