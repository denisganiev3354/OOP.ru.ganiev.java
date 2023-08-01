package module;

public class Student implements Comparable<Student>{

    private Long getStudentId() {
        return getStudentId;
    }
    public String getLastName;
    public String getFirstName;
    public String getSecondName;
    private Long StudentId;
    private String lastName;
    private String firstName;
    private String secondName;
    private Long getStudentId;

    public Student(String lastName, String firstName, String secondName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Student(Long studentId, String lastName, String firstName, String secondName) {
        StudentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
    }



    @Override
    public int compareTo(Student o) {

        return this.StudentId.compareTo(o.getStudentId());
    }

    public String getLastName() {
        return null;
    }
}
