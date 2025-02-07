package E12_zad1_sports;

import java.util.Arrays;

public class TestAthlete {
    public static void main(String[] args) {
        // ✅ Создаем массив спортсменов
        Athlete[] athletes = {
                new Athlete("Usain Bolt", "Jamaica", new double[]{9.58, 9.63, 9.69}),
                new Athlete("Carl Lewis", "USA", new double[]{9.86, 9.92, 10.00}),
                new Athlete("Yohan Blake", "Jamaica", new double[]{9.69, 9.72, 9.75}),
                new Athlete("Tyson Gay", "USA", new double[]{9.69, 9.71, 9.77}),
                new Athlete("Asafa Powell", "Jamaica", new double[]{9.72, 9.74, 9.76})
        };

        // ✅ Сортируем по `RecordComparator`
        Arrays.sort(athletes, new RecordComparator().thenComparing(new NationalityNameComparator()));


        // ✅ Выводим результат
        System.out.println("Отсортированные спортсмены:");
        for (Athlete athlete : athletes) {
            System.out.println(athlete);
        }
    }
}
