package ru.gb.study_group;

public class StudentBuilder {
    private int genId;
    private Student student;
    private int studentAge;
    private String studentName;

    public StudentBuilder() {
        createStudent();
    }

    public StudentBuilder setStudentAge(int studentAge) {
        this.studentAge = studentAge;
        return this;
    }

    public StudentBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    private void createStudent() {
        student = new Student();
    }

    private void nextId(){
        student.setId(genId++);
    }

    private void createName(){
        student.setName(studentName);
    }

    private void createAge(){
        student.setAge(studentAge);
    }

    public Student build(){
        createStudent();
        createName();
        createAge();
        nextId();
        return student;
    }
}
