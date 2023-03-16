package org.example;

import java.util.*;

class User {
    /*
    * The user should contain username password.
    * The user should contain an ArrayList of favorite shows and watch history.
    * FUNCTION: the user should have a function to watch a show and add it to watch history.
    *  *** NOTE: All search functions in user are for searching in favorite shows ***
    */
    private String username;
    private String password;
    private static List<TVShow> favoriteList;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User(){
        this.favoriteList= new ArrayList<>();
    }

    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public static ArrayList<TVShow> searchByTitle(String title) {
        ArrayList<TVShow> found = new ArrayList<TVShow>();
        for(TVShow tvshow: favoriteList){
            if(favoriteList.contains(title)){
                found.add(tvshow);
            }
        }
        return found;
    }

    public static ArrayList<TVShow> searchByGenre(String genre) {
        ArrayList<TVShow> found = new ArrayList<TVShow>();
        for(TVShow tvshow: favoriteList){
            if(favoriteList.contains(genre)){
                found.add(tvshow);
            }
        }
        return found;
    }

    public static ArrayList<TVShow> searchByReleaseYear(int year) {
        ArrayList<TVShow> found = new ArrayList<TVShow>();
        for(TVShow tvshow: favoriteList){
            if(favoriteList.contains(year)){
                found.add(tvshow);
            }
        }
        return found;
    }


    public static void addToFavorites(TVShow show) {
        favoriteList.add(show);
    }

    public static void viewFavorites() {
        String data;
        for(TVShow tvShow : favoriteList){
            data = tvShow.getTitle() + "/ " + tvShow.getYear() ;
            System.out.println(data);
        }
    }

    public static ArrayList<String> getRecommendations(String showName){
        ArrayList<String> Recomm = new ArrayList<String>();
        Recomm.add(showName);
        return Recomm;
    }
}
