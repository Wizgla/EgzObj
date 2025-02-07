package A13_zad1_space;

public class TestSpace {
    public static void main(String[] args) {
        // ✅ Создаем два объекта Spacecraft
        Spacecraft craft1 = new Spacecraft("Falcon 9", "SpaceX", new double[]{9.5, 8.7, 9.0});
        Spacecraft craft2 = new Spacecraft("Apollo 11", "NASA", new double[]{10.0, 9.8, 9.7});

        // ✅ Выводим первоначальную информацию
        System.out.println("Исходные объекты:");
        System.out.println(craft1);
        System.out.println(craft2);

        // ✅ Добавляем оценки
        craft1.addRating(9.2);
        craft2.addRating(9.9);

        System.out.println("\nПосле добавления оценки:");
        System.out.println(craft1);
        System.out.println(craft2);

        // ✅ Удаляем оценки
        craft1.remRatings();
        craft2.remRatings();

        System.out.println("\nПосле удаления оценки:");
        System.out.println(craft1);
        System.out.println(craft2);

        // ✅ Проверяем equals()
        Spacecraft craft3 = new Spacecraft("Falcon 9", "SpaceX", new double[]{9.5, 8.7, 9.0});
        System.out.println("\nСравнение craft1 и craft3: " + craft1.equals(craft3)); // Должно быть false, так как массивы разные

        // ✅ Проверяем hashCode()
        System.out.println("Хеш-код craft1: " + craft1.hashCode());
        System.out.println("Хеш-код craft3: " + craft3.hashCode());
    }
}
