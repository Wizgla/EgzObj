package A14_zad4_countGreaterThan;

import java.util.LinkedList;

public class Count {
    public static <E extends Comparable<E>> int countGreaterThan(E num, LinkedList<E> list){
        int count = 0;
        for(E elem : list){
            if(elem.compareTo(num)>0){count++;}
        }
        return count;
    }
}
