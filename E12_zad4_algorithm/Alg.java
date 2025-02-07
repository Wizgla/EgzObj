package E12_zad4_algorithm;

public class Alg {
    public static <T> boolean compareThree(T o1,T o2,T o3){
        if(o1.equals(o2)&&o1.equals(o3)){return true;}
        else return false;
    }
}
