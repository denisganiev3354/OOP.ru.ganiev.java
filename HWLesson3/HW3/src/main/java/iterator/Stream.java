package iterator;

import module.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{

    private int count;

    private List<StudentGroup> studentGroupList;

    public Stream(int count, List<StudentGroup> studentGroupList) {
        this.count = count;
        this.studentGroupList = studentGroupList;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    @Override
    public boolean hasNext() {
        return count < studentGroupList.size() - 1;
    }
    @Override
    public StudentGroup next() {
        if(!hasNext()){
            return null;
        }
        count++;
        return studentGroupList.get(count);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return null;
    }
}