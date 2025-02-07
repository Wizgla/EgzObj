package A13_zad1_space.second;

public class TestImmutableSpacecraftPosition {
    public static void main(String[] args) {
        // ✅ Создаем объект с начальными координатами (1.0, 2.0, 3.0)
        ImmutableSpacecraftPosition position1 = new ImmutableSpacecraftPosition(1.0, 2.0, 3.0);
        System.out.println("Первый объект: " + position1);

        // ✅ Перемещаем объект на (4, -5, 6)
        ImmutableSpacecraftPosition position2 = position1.move(4.0, -5.0, 6.0);
        System.out.println("Второй объект (после move): " + position2);

        // ✅ Проверяем, что первый объект не изменился (иммутабельность)
        System.out.println("Первый объект после move(): " + position1);
    }
}

