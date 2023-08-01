package controler;

import module.Student;
import service.StudentGroupService;

import java.util.List;

public class Controler {
    private StudentGroupService studentGroupService = new StudentGroupService();
    public void removeStudentByFIO(String lastName, String firstName, String secondName) {
        studentGroupService.removeStudentByFIO(lastName, firstName, secondName);
    }

    public List<Student> getSortedStudientList(){
        return studentGroupService.getSortedStudientList();
    }
    public List<Student> getSortedStudentListByFIO(){
        return studentGroupService.getSortedStudentListByFIO();
    }
}
