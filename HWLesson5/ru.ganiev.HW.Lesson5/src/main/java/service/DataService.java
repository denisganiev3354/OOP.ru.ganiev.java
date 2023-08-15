package service;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

import java.util.List;

public class DataService {
    private List<User> userList;
    public static void create(String lastName, String firstName, String secondName, Type type){


    }
    private int getFreeID(Type type){
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user: userList) {
            if (user instanceof Teacher && !itsStudent){
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Teacher && itsStudent){
                lastId = ((Student) user).getStudentID() + 1;
            }
        }

        return lastId;
    }
    public void create(String firstName, String secondName, String lastName){
       Type type = null;
        int id = getFreeID(type);
        if(Type.STUDENT == type){
            Student student = new Student(firstName, secondName, lastName, id);
            userList.add(student);
        }
        if(Type.TEACHER == type){
            Teacher teacher = new Teacher(firstName, secondName, lastName, id);
            userList.add(teacher);
        }

    }
    public List<User> getUserList(){
        return userList;
    }
}
