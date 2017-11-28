package controller;

import model.Record;
import model.Journal;
import view.JournalView;
import view.exceptions.WrongInputException;

import static view.constants.UserInterfaceConsts.InputConstants.RECORD_ADDED;

public class MainController {
    private JournalView view;
    Journal journal = new Journal();

    public MainController(JournalView view){
        this.view = view;
    }

    public static void runApplication(){

    }


    public void run() {
        view.changeLocale();
        while (true) {
            try {
                switch (view.viewInterface()) {
                    case 1:
                        Checker recordCreator = new Checker(view);
                        journal.addRecord(recordCreator.createRecord());
                        view.printMessage(view.manager.getValue(RECORD_ADDED));
                        break;
                    case 2:
                        for (Record record : journal.getRecords()) {
                            view.printMessage(record.toString());
                        }
                        view.printMessage("\n");
                        break;
                    case 3:
                        view.changeLocale();
                        break;
                    case 4:
                        System.exit(0);
                }
            } catch (WrongInputException e) {
                e.printStackTrace();
            }
        }
    }



}

