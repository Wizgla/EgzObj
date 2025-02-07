package A11_zad3_moto;

public class MaxVal {
    public static <T extends Comparable<T>>T maxValue(T[] array){
        if(array == null){throw new IllegalArgumentException("Массив не может быть null");}
        if(array.length == 0){throw new IllegalArgumentException("Массив не может быть пуст");}
        T max = array[0];

        for(T element : array){
            if(element.compareTo(max)>0){
                max = element;
            }
        }
        return max;
    }
}
