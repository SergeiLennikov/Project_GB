package ru.gb.study_group;

import java.util.*;

public class StudyGroup implements Iterable<Student> {
    private List<Student> students;

    public StudyGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void sortByName(){
        Collections.sort(students);
    }

    public void sortByAge(){
        Collections.sort(students, new StudentComparatorByAge());
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
    }
}

