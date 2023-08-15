package model;

public class Teacher extends User{
    private int teacherId;

    public Teacher(String lastName, String secondName, String firstName, int teacherId) {
        super(lastName, secondName, firstName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
