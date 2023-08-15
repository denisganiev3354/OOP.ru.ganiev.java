package model;

public class Student extends User{

    private int studentID;

    public Student(String lastName, String secondName, String firstName, int studentID) {
        super(lastName, secondName, firstName);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

}
