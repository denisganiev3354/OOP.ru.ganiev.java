package controller;

import iterator.Stream;
import module.Student;
import module.StudentGroup;
import service.StreamService;
import service.StudentGroupService;

import java.util.List;

public class Controler {
    private StudentGroupService studentGroupService = new StudentGroupService();
    private StreamService streamService = new StreamService();

    public void removeStudentByFIO(String lastName, String firstName, String secondName) {
        studentGroupService.removeStudentByFIO(lastName, firstName, secondName);
    }

    public List<Student> getSortedStudentList() {
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentListByFIO() {
        return studentGroupService.getSortedStudentListByFIO();
    }

    public List<Stream> getSortedStream(List<Stream> streamList) {
        streamService.getSortedStream(streamList);
        return streamList;
    }

}