package services;

import controller.MainController;
import view.JournalView;

import java.util.Locale;

public class Main {
    public static void main(String [] args){
        JournalView view = new JournalView();
        MainController controller = new MainController(view);
        controller.run();
    }
}
