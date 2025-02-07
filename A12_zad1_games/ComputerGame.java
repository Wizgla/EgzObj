package A12_zad1_games;

import java.util.Arrays;
import java.util.Objects;

public class ComputerGame {
    String title;
    String producer;
    double[] ratings;

    public ComputerGame(String title, String producer, double[] ratings) {
        this.title = title;
        this.producer = producer;
        this.ratings = Arrays.copyOf(ratings,ratings.length);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double[] getRatings() {
        return Arrays.copyOf(this.ratings,this.ratings.length);
    }

    public void setRatings(double[] ratings) {
        this.ratings = Arrays.copyOf(ratings,ratings.length);;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerGame that = (ComputerGame) o;
        return Objects.equals(title, that.title) && Objects.equals(producer, that.producer) && Objects.deepEquals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, producer, Arrays.hashCode(ratings));
    }

    public void addRating(double addrating){
        double[] newRating = Arrays.copyOf(this.ratings,this.ratings.length+1);
        newRating[newRating.length-1] = addrating;
        this.ratings = Arrays.copyOf(newRating,newRating.length);
    }
    public void remRating(){
        this.ratings = Arrays.copyOf(this.ratings,this.ratings.length-1);
    }

    @Override
    public String toString() {
        return "ComputerGame{" +
                "title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                ", ratings=" + Arrays.toString(ratings) +
                '}';
    }
}
