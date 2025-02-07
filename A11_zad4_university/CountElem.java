package A11_zad4_university;

import java.util.Collection;

public class CountElem {

    public static <T> int countElements(Collection<T> items,T element){
        int count = 0;
        for(T item: items){
            if(item.equals(element)){count++;}
        }
        return count;
    }

}
