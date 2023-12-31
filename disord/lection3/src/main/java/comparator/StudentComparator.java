package comparator;

import module.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int resultCompLastName = o1.getLastName.compareTo(o2.getLastName());
        if(resultCompLastName == 0){
            int resustCompFirstName = o1.getFirstName.compareTo(o2.getFirstName);
            if(resustCompFirstName == 0){
                return o1.getSecondName.compareTo(o2.getSecondName);
            }
            return resustCompFirstName;
        }
        return 0;
    }
}
