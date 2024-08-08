package ru.gb.study_group;

public class Main {
    public static void main(String[] args) {
        Service service  = new Service();

        service.addStudent("Саша",10);
        service.addStudent("Маша",23);
        service.addStudent("Даша",24);
        service.addStudent("Паша",23);
        service.addStudent("Миша",14);

        System.out.println(service.getStudentListInfo());
        service.sortByName();
        System.out.println(service.getStudentListInfo());
        service.sortByAge();
        System.out.println(service.getStudentListInfo());
    }
}
