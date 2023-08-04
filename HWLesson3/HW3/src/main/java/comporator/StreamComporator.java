package comporator;

import iterator.Stream;

import java.util.Comparator;

public class StreamComporator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2){
        boolean result = o1.getStudentGroupList().size() > o2.getStudentGroupList().size();
        if(result){
            return 1;
        }
        else if (o1.getStudentGroupList().size() < o2.getStudentGroupList().size()){
            return -1;
        }
        return 0;
    }

}