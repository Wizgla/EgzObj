package E13_zad3_utilities;

public class Test {
    public static void main(String[] args) {
        // ✅ Тест с числами
        System.out.println("Минимум (числа): " + Find.findMin(10, 3, 7)); // 3

        // ✅ Тест с `Double`
        System.out.println("Минимум (дробные числа): " + Find.findMin(5.7, 2.9, 4.1)); // 2.9

        // ✅ Тест с `String` (лексикографический порядок)
        System.out.println("Минимум (строки): " + Find.findMin("apple", "banana", "cherry")); // "apple"

        // ✅ Тест с `Character`
        System.out.println("Минимум (символы): " + Find.findMin('Z', 'A', 'M')); // 'A'
    }
}
