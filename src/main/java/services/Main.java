package services;

import controller.MainController;
import view.JournalView;

public class Main {
    public static void main(String [] args){
        JournalView view = new JournalView();
        MainController controller = new MainController(view);
        controller.run();
    }
}
