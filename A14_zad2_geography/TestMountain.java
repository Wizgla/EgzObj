package A14_zad2_geography;

import java.util.ArrayList;
import java.util.List;

public class TestMountain {
    public static void main(String[] args) {
        // ✅ Создаем список высот (ArrayList вместо массива)
        ArrayList<Double> originalHeights = new ArrayList<>();
        originalHeights.add(8848.86);
        originalHeights.add(8848.72);
        originalHeights.add(8848.68);
        originalHeights.add(8848.65);
        originalHeights.add(8848.60);

        // ✅ Создаем объект Mountain
        Mountain originalMountain = new Mountain("Everest", originalHeights);

        // ✅ Клонируем объект
        Mountain clonedMountain = originalMountain.clone();


        // ✅ Выводим результаты
        System.out.println("Оригинальная гора: " + originalMountain);
        System.out.println("Клонированная гора: " + clonedMountain);
        originalMountain.setName("penis");

        // ✅ Проверяем, что изменения не повлияли на клон
        System.out.println("\nПроверка независимости объектов:");
        System.out.println("Первая высота оригинала: " + originalMountain.getName());
        System.out.println("Первая высота клона: " + clonedMountain.getName());
    }
}
