package A12_zad3_echo;

public class echo {
    public static <T> void echoIfEquivalent(T first, T second, T third){
        if(first.equals(second) && first.equals(third)){
            System.out.println("sa rowne");
        }
    }
}
