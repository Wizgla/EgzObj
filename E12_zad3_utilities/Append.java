package E12_zad3_utilities;

import java.util.List;
import java.util.ArrayList;

public class Append {
    public static <E> void appendFromEnd(List<? super E> l1, List<E> l2){
        l1.addAll(l2);
    }
}
