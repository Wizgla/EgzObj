package A12_zad4_checking;

import java.util.HashSet;

public class Check {
    static <E> boolean checkDisjoint(HashSet<E> set1,HashSet<E> set2){
        if(set1 == null|| set2 == null){throw new IllegalArgumentException("Zbior nie moze byc null");}
        for(E item1 : set1){
            for(E item2 : set2){
                if(item1.equals(item2)){return false;}
            }
        }
        return true;
    }
}
