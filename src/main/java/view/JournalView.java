package view;

import services.ResourceManager;
import view.exceptions.WrongInputException;

import java.util.Locale;
import java.util.Scanner;

import static view.constants.UserInterfaceConsts.InputConstants.CHANGE_LOCALE;
import static view.constants.UserInterfaceConsts.MenuConstants.*;

public class JournalView {
    public ResourceManager manager = ResourceManager.INSTANCE;

    public void changeLocale(){
        System.out.println(manager.getValue(CHANGE_LOCALE));
        manager.changeResource(new Locale(new Scanner(System.in).nextLine()));
    }

    public int viewInterface() throws WrongInputException{
        System.out.println(manager.getValue(MENU_CASE_1));
        System.out.println(manager.getValue(MENU_CASE_2));
        System.out.println(manager.getValue(MENU_CASE_3));
        System.out.println(manager.getValue(MENU_CASE_4));

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        if(inputNumber > 4 || inputNumber < 1)
            throw new WrongInputException();
        return inputNumber;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}

