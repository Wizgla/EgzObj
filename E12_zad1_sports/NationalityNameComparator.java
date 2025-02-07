package E12_zad1_sports;

import java.util.Comparator;

public class NationalityNameComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        int res = o1.getNationality().compareTo(o2.getNationality());
        if(res == 0){
            return o1.getName().compareTo(o2.getName());
        }
        return res;
    }
}
