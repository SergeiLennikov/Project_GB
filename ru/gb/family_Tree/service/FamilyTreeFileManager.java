package ru.gb.family_Tree.service;

import ru.gb.family_Tree.model.FamilyTree;
import ru.gb.family_Tree.model.FamilyTreeOperations;

import java.io.IOException;

public class FamilyTreeFileManager {
    private IFileOperations fileOps;

    public FamilyTreeFileManager(IFileOperations fileOps) {
        this.fileOps = fileOps;
    }

    public void saveToFile(String fileName, FamilyTreeOperations<?> familyTree) throws IOException {
        fileOps.saveToFile(fileName, (FamilyTree) familyTree);
    }

    public FamilyTreeOperations<?> loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        return fileOps.loadFromFile(fileName);
    }
}
