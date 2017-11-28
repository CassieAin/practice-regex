package controller;

import model.Record;
import services.ResourceManager;
import model.Journal;
import view.JournalView;

import static view.constants.UserInterfaceConsts.InputConstants.*;
import static view.constants.UserInterfaceConsts.RegexConstants.*;

public class Checker {
    private JournalView view;
    private ResourceManager manager;
    public Checker(JournalView view){
        this.view = view;
        this.manager = view.manager;
    }

    public Record createRecord(){
        Record record = new Record();
        record.setName(checkString(manager.getValue(INPUT_FIRSTNAME), manager.getValue(REGEX_FIRSTNAME)));
        record.setSurname(checkString(manager.getValue(INPUT_SURNAME), manager.getValue(REGEX_SURNAME)));
        record.setDateOfBirth(checkString(manager.getValue(INPUT_DATE_OF_BIRTH), manager.getValue(REGEX_DATE_OF_BIRTH)));
        record.setPhoneNumber(checkString(manager.getValue(INPUT_PHONE_NUMBER), manager.getValue(REGEX_PHONE_NUMBER)));
        record.setAddress(checkString(manager.getValue(INPUT_ADDRESS), manager.getValue(REGEX_ADDRESS)));

        return record;
    }

    public String checkString(String input, String regex){
        if(checkRegexMatching(input,regex))
            return input;
        return "It does not match";
    }

    private boolean checkRegexMatching(String input, String regex){
        return input.trim().matches(regex);
    }
}
