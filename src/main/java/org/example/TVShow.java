package org.example;

import java.util.ArrayList;
import java.util.*;

class TVShow {
    /*
    *The TVShow should have a title , genre, release year, duration and a rating.
     *The TVShow should have an ArrayList of the cast.
     */

    private List<String> castList;
    public String title;
    public String genre;
    public int year;
    public double duration;
    public double rating;

    public TVShow(String title, String genre, int year, double duration, double rating) {
        this.castList = new ArrayList<>();
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString(TVShow tvshow) {
        return "TVShow{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year + '\'' +
                ", duration=" + duration + '\'' +
                ", rating=" + rating +
                '}';
    }
}
