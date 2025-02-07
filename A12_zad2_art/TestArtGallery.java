package A12_zad2_art;

public class TestArtGallery {
    public static void main(String[] args) {
        // ✅ Получаем первый экземпляр с именем "Louvre"
        ArtGallery gallery1 = ArtGallery.getInstance("Louvre");
        System.out.println("Первый вызов getInstance: " + gallery1.getName());

        // ✅ Пробуем создать второй экземпляр с другим именем
        ArtGallery gallery2 = ArtGallery.getInstance("Metropolitan Museum");
        System.out.println("Второй вызов getInstance: " + gallery2.getName());

        // ✅ Проверяем, одинаковые ли объекты
        System.out.println("Обе ссылки указывают на один объект: " + (gallery1.equals(gallery2)));
    }
}
