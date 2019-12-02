package training.chess;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Box<Bishop> boxForBishops = new Box<Bishop>();

        String display = String.format("%h",43);
        System.out.println(display);

        System.out.println();

    }


    public static <E> List<E> returnWhatYouGiveIt(E thing) {
        List<E> bob = new ArrayList<>();
        bob.add(thing);
        return bob;

    }
}
