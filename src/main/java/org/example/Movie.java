package org.example;

import java.util.*;

class Movie extends TVShow {
    /*
     *Movie is extended from TVShow and has extra attribute length.
     */

    private int quality;
    private String country;
    private int ageGrade;
    private String synopsis;

    public Movie(String title, String genre, int year, double duration, double rating, int quality, String country, int ageGrade, String synopsis){
        super(title, genre, year, duration, rating);
        this.quality = quality;
        this.country = country;
        this.ageGrade = ageGrade;
        this.synopsis = synopsis;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAgeGrade() {
        return ageGrade;
    }

    public void setAgeGrade(int ageGrade) {
        this.ageGrade = ageGrade;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }


    public String toString(Movie movie) {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                ", rating=" + rating +
                ", quality=" + quality +
                ", country='" + country + '\'' +
                ", ageGrade=" + ageGrade +
                ", synopsis='" + synopsis + '\'' +
                '}';
    }
}
