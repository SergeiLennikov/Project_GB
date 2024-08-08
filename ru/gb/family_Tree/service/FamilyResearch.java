package ru.gb.family_Tree.service;

import ru.gb.family_Tree.model.FamilyTree;
import ru.gb.family_Tree.model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class FamilyResearch implements IFamilyResearch {
    private FamilyTree familyTree;

    public FamilyResearch(FamilyTree familyTree) {

        this.familyTree = familyTree;
    }

    @Override
    public List<Person> getChildren(String name) {
        Person person = (Person) familyTree.findPerson(name);
        return person != null ? person.getChildren() : null;
    }

    @Override
    public Person[] getParents(String name) {
        Person person = (Person) familyTree.findPerson(name);
        if (person != null) {
            return new Person[]{person.getFather(), person.getMother()};
        }
        return null;
    }

    @Override
    public List<Person> getSiblings(String name) {
        Person person = (Person) familyTree.findPerson(name);
        if (person != null) {
            Person father = person.getFather();
            Person mother = person.getMother();
            if (father != null) {
                return father.getChildren().stream()
                        .filter(child -> !child.equals(person))
                        .collect(Collectors.toList());
            } else if (mother != null) {
                return mother.getChildren().stream()
                        .filter(child -> !child.equals(person))
                        .collect(Collectors.toList());
            }
        }
        return null;
    }
}
