package A13_zad3_vehicle;

public class TestIsDescending {
    public static void main(String[] args) {
        // ✅ Тест 1: Убывающий массив (должно вернуть true)
        Integer[] descendingArray = {9, 7, 5, 3, 1};
        System.out.println("Тест 1 (убывающий): " + Desc.isDescending(descendingArray));

        // ✅ Тест 2: Неубывающий массив (должно вернуть false)
        Integer[] nonDescendingArray = {1, 3, 5, 7, 9};
        System.out.println("Тест 2 (возрастающий): " + Desc.isDescending(nonDescendingArray));

        // ✅ Тест 3: Массив с одинаковыми элементами (должно вернуть true)
        Integer[] sameElements = {5, 5, 5, 5};
        System.out.println("Тест 3 (одинаковые элементы): " + Desc.isDescending(sameElements));

        // ✅ Тест 4: Массив с одним элементом (должно вернуть true)
        Integer[] singleElement = {42};
        System.out.println("Тест 4 (один элемент): " + Desc.isDescending(singleElement));

    }
}
