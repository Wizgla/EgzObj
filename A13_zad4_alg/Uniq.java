package A13_zad4_alg;

import java.util.HashSet;
import java.util.TreeSet;

public class Uniq {
    public static <E> boolean isUnique(TreeSet<E> elements){
        if(elements == null){throw new IllegalArgumentException("Сет не может быть null");}
        HashSet<E> hass = new HashSet<>();
        for(E elem:elements){
            if(!hass.add(elem)){return false;}
        }
        return true;
    }
}
