package model;

public abstract class User {
    private String lastName;
    private String secondName;
    private String firstName;

    public User(String lastName, String secondName, String firstName) {
        this.lastName = lastName;
        this.secondName = secondName;
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }
}
