package A13_zad3_vehicle;

public class Desc {
    public static <T extends Comparable<T>> boolean isDescending(T[] table){
        for(int i = 0;i<table.length-1;i++){
            if(table[i].compareTo(table[i+1])<0){return false;}
        }
        return true;
    }
}
