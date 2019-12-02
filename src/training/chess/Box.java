package training.chess;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Piece > {
    private List<T> contents = new ArrayList<T>();

    public void add(T thing) {
        contents.add(thing);
    }
    public List<T> readcontents(){
        return contents;
    }
}
