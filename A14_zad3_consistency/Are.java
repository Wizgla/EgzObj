package A14_zad3_consistency;

public class Are {
    public static <T> boolean areBothNonNull(T o1,T o2){
        if(o1 == null || o2 == null){
            return false;
        }
        else return true;
    }
}
