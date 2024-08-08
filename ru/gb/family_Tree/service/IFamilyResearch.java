package ru.gb.family_Tree.service;

import ru.gb.family_Tree.model.Person;

import java.util.List;

public interface IFamilyResearch {
    List<Person> getChildren(String name);
    Person[] getParents(String name);
    List<Person> getSiblings(String name);
}
