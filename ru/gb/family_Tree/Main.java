package ru.gb.family_Tree;


import ru.gb.family_Tree.model.FamilyTree;
import ru.gb.family_Tree.model.FamilyTreeOperations;
import ru.gb.family_Tree.model.Person;
import ru.gb.family_Tree.presenter.FamilyTreePresenter;
import ru.gb.family_Tree.service.FamilyTreeFileManager;
import ru.gb.family_Tree.service.FamilyTreeService;
import ru.gb.family_Tree.service.FileOperations;
import ru.gb.family_Tree.service.PersonFactory;
import ru.gb.family_Tree.view.ConsoleFamilyTreeView;
import ru.gb.family_Tree.view.FamilyTreeView;

public class Main {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        System.setProperty("console.encoding", "UTF-8");

        FamilyTreeOperations<Person> familyTree = new FamilyTree<>();
        PersonFactory personFactory = new PersonFactory();
        FamilyTreeService service = new FamilyTreeService(familyTree, personFactory);
        FamilyTreeView view = new ConsoleFamilyTreeView();
        FileOperations fileOps = new FileOperations();
        FamilyTreeFileManager fileManager = new FamilyTreeFileManager(fileOps);

        FamilyTreePresenter presenter = new FamilyTreePresenter(service, view, fileManager);

        presenter.run();
    }
}
