package ru.ganiev.OOP.lesson_3;
//<aside>
//📔 **Текст задания:**
//
//        - Создать класс Студент
//        - Создать класс УчебнаяГруппаИтератор
//        - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
//        - Реализовать его контракты (включая удаление)
//</aside>
public class Student {
    private int numberOfStudent;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(int numberOfStudent, String firstName, String secondName, String lastName) {
        this.numberOfStudent = numberOfStudent;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;

    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int number) {
        this.numberOfStudent = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String name) {
        this.secondName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + numberOfStudent + '\'' +
                ", firstName='" + this.getFirstName() + '\'' +
                ", secondName='" + this.getSecondName() + '\'' +
                '}';

    }
}