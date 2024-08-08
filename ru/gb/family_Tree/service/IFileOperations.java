package ru.gb.family_Tree.service;

import ru.gb.family_Tree.model.FamilyTree;

import java.io.IOException;

public interface IFileOperations {
    void saveToFile(String fileName, FamilyTree familyTree) throws IOException;
    FamilyTree loadFromFile(String fileName) throws IOException, ClassNotFoundException;
}
