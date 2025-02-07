package A12_zad1_games;

public class TestGames {
    public static void main(String[] args) {
        // ✅ 1. Создаем два объекта ComputerGame
        ComputerGame game1 = new ComputerGame("Cyberpunk 2077", "CD Projekt", new double[]{8.5, 9.0, 7.8});
        ComputerGame game2 = new ComputerGame("The Witcher 3", "CD Projekt", new double[]{9.5, 10.0, 9.0});

        // ✅ 2. Вывод информации об играх
        System.out.println("Изначальные игры:");
        System.out.println(game1);
        System.out.println(game2);

        // ✅ 3. Добавляем оценки
        game1.addRating(8.2);
        game2.addRating(9.8);

        System.out.println("\nПосле добавления оценок:");
        System.out.println(game1);
        System.out.println(game2);

        // ✅ 4. Удаляем последнюю оценку
        game1.remRating();
        game2.remRating();

        System.out.println("\nПосле удаления последней оценки:");
        System.out.println(game1);
        System.out.println(game2);

        // ✅ 5. Проверяем equals()
        ComputerGame game3 = new ComputerGame("Cyberpunk 2077", "CD Projekt", new double[]{8.5, 9.0, 7.8});
        System.out.println("\nСравнение game1 и game3: " + game1.equals(game3)); // true

        // ✅ 6. Проверяем hashCode()
        System.out.println("Хеш-код game1: " + game1.hashCode());
        System.out.println("Хеш-код game3: " + game3.hashCode());
    }
}
