package controller;

import model.Student;
import model.Type;
import model.User;
import service.DataService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private User[] userlist;

    private void createStudent(String firstName, String lastName, String secondName){
        service.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public List<User> userList(){
        List<User> students = new ArrayList<>();
        for (User user: userlist) {
            if (user instanceof Student){
                students.add(user);
            }
        }
        return students;
    }
    public void getAllStudent(){
        List<User> userList = service.getUserList();
        for (User user: userList) {
            Student student = (Student) user;
            view.printOnConsole(student);

        }

    }
}

