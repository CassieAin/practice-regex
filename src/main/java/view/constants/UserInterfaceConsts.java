package view.constants;

public interface UserInterfaceConsts {
    interface MenuConstants {
        String INTRODUCTION = "Hello, user! Please, input one of the numbers:";
        String GOODBYE = "Goodbye!";
        String MENU_CASE_1 = "menu.case.1";
        String MENU_CASE_2 = "menu.case.2";
        String MENU_CASE_3 = "menu.case.3";
        String MENU_CASE_4 = "menu.case.4";
    }

    interface InputConstants {
        String INPUT_FIRSTNAME = "input.firstname";
        String INPUT_SURNAME = "input.surname";
        String INPUT_DATE_OF_BIRTH = "input.dateofbirth";
        String INPUT_PHONE_NUMBER = "input.phonenumber";
        String INPUT_ADDRESS = "input.address";
        String CHANGE_LOCALE = "input.change.locale";
        String WRONG_INPUT_MESSAGE = "input.wrong";
        String RECORD_ADDED = "input.record.added";
    }

    interface RegexConstants{
        String REGEX_FIRSTNAME = "firstname.regex";
        String REGEX_SURNAME = "surname.regex";
        String REGEX_DATE_OF_BIRTH = "dateofbirth.regex";
        String REGEX_PHONE_NUMBER = "phonenumber.regex";
        String REGEX_ADDRESS = "address.regex";
    }
}
