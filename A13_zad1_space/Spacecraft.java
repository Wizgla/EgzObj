package A13_zad1_space;

import java.util.Arrays;
import java.util.Objects;

public class Spacecraft {
    String name;
    String manufacturer;
    double[] ratings;

    public Spacecraft(String name, String manufacturer, double[] ratings) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.ratings = Arrays.copyOf(ratings,ratings.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double[] getRatings() {
        return ratings;
    }

    public void setRatings(double[] ratings) {
        this.ratings = Arrays.copyOf(ratings,ratings.length);
    }
    public void addRating(double addratings){
        double[] newRating = Arrays.copyOf(this.ratings,this.ratings.length+1);
        newRating[newRating.length-1] = addratings;
        this.ratings = Arrays.copyOf(newRating,newRating.length);
    }
    public void remRatings(){
        this.ratings = Arrays.copyOf(this.ratings,this.ratings.length-1);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + name + ", " + manufacturer + ", " + Arrays.toString(ratings)+'.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spacecraft that = (Spacecraft) o;
        return Objects.equals(name, that.name) && Objects.equals(manufacturer, that.manufacturer) && Objects.deepEquals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer, Arrays.hashCode(ratings));
    }
}
