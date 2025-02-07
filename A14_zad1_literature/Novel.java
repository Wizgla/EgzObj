package A14_zad1_literature;

import java.util.Arrays;
import java.util.Objects;

public class Novel {
    String title;
    String autor;
    double[] ratings;

    public Novel(String title, String autor, double[] ratings) {
        this.title = title;
        this.autor = autor;
        this.ratings = Arrays.copyOf(ratings,ratings.length);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double[] getRatings() {
        return ratings;
    }

    public void setRatings(double[] ratings) {
        this.ratings = Arrays.copyOf(ratings,ratings.length);;
    }
    public void addRating(double addraiting){
        double[] newRating = Arrays.copyOf(this.ratings,this.ratings.length+1);
        newRating[newRating.length-1] = addraiting;
        this.ratings = Arrays.copyOf(newRating,newRating.length);
    }
    public void remRating(){
        this.ratings = Arrays.copyOf(this.ratings,this.ratings.length-1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Novel novel = (Novel) o;
        return Objects.equals(title, novel.title) && Objects.equals(autor, novel.autor) && Objects.deepEquals(ratings, novel.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, autor, Arrays.hashCode(ratings));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + this.title + ", "+this.autor + ", "+Arrays.toString(ratings);
    }
}
