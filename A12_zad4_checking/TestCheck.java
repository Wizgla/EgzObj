package A12_zad4_checking;

import java.util.HashSet;

public class TestCheck {
    public static void main(String[] args) {
        // ✅ Создаем два множества
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();

        // ✅ Заполняем множества
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(4);
        set2.add(5);
        set2.add(6);

        set3.add(2); // Общий элемент с set1

        // ✅ Тест 1: Разные множества
        System.out.println("set1 i set2 rozłączne: " + Check.checkDisjoint(set1, set2)); // true

        // ✅ Тест 2: set1 и set3 имеют общий элемент
        System.out.println("set1 i set3 rozłączne: " + Check.checkDisjoint(set1, set3)); // false

        // ✅ Тест 3: Один из множеств пуст
        HashSet<Integer> emptySet = new HashSet<>();
        System.out.println("set1 i emptySet rozłączne: " + Check.checkDisjoint(set1, emptySet)); // true

        // ✅ Тест 4: Исключение при `null`
        try {
            Check.checkDisjoint(set1, null);
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage()); // Должно вывести сообщение об ошибке
        }
    }
}
