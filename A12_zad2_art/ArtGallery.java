package A12_zad2_art;

public class ArtGallery {
    String name;
    private static  ArtGallery instance;
    public ArtGallery(String name) {
        this.name = name;
    }

    public static ArtGallery getInstance(String name){
        if(instance == null){
            instance = new ArtGallery(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
