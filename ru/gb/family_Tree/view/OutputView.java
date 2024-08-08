package ru.gb.family_Tree.view;


import ru.gb.family_Tree.model.Person;

import java.util.List;

public interface OutputView {
    void displayMenu();
    void displayMessage(String message);
    void displayPerson(Person person);
    void displayPersonList(List<Person> people);
}
