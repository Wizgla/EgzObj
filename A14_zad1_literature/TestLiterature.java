package A14_zad1_literature;

public class TestLiterature {
    public static void main(String[] args) {
        // ✅ Создаем два объекта Novel
        Novel novel1 = new Novel("The Catcher in the Rye", "J.D. Salinger", new double[]{8.5, 9.0, 7.8});
        Novel novel2 = new Novel("1984", "George Orwell", new double[]{9.5, 10.0, 9.0});

        // ✅ Выводим первоначальную информацию
        System.out.println("Исходные объекты:");
        System.out.println(novel1);
        System.out.println(novel2);

        // ✅ Добавляем оценки
        novel1.addRating(8.2);
        novel2.addRating(9.8);

        System.out.println("\nПосле добавления оценки:");
        System.out.println(novel1);
        System.out.println(novel2);

        // ✅ Удаляем оценки
        novel1.remRating();
        novel2.remRating();

        System.out.println("\nПосле удаления оценки:");
        System.out.println(novel1);
        System.out.println(novel2);

        // ✅ Проверяем equals()
        Novel novel3 = new Novel("The Catcher in the Rye", "J.D. Salinger", new double[]{8.5, 9.0, 7.8});
        System.out.println("\nСравнение novel1 и novel3: " + novel1.equals(novel3)); // false, потому что массивы разные

        // ✅ Проверяем hashCode()
        System.out.println("Хеш-код novel1: " + novel1.hashCode());
        System.out.println("Хеш-код novel3: " + novel3.hashCode());
    }
}
