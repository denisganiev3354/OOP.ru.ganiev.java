package service;

import comporator.StreamComporator;
import iterator.Stream;
import java.util.List;

public class StreamService {

    public List<Stream> getSortedStream(List<Stream> streamList){
        streamList.sort(new StreamComporator());
        return streamList;
    }
}