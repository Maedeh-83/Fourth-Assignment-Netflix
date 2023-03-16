package org.example;

import java.util.*;

class NetflixService {
    /*
     *The NetflixService should have an Arraylist of users, tv shows and movies.
     *The NetflixService should have a User object which represents current user.
     */
    Scanner input = new Scanner(System.in);

    private static List<User> usersList;
    private static List<Admin> adminsList;
    private static List<TVShow> TVshowList;
    private static List<Movie> movieList;

    public NetflixService() {
        this.usersList = new ArrayList<>();
        this.TVshowList = new ArrayList<>();
        this.movieList = new ArrayList<>();
        this.adminsList = new ArrayList<>();
    }

    public static void addTVShow(TVShow tvShow){
        // Implement add tv show logic here
        TVshowList.add(tvShow);
    }

    public static void addMovie(Movie movie){
        // Implement add movie logic here
        movieList.add(movie);
    }

    public static void createUserAccount(User user) {
        usersList.add(user);
    }

    public static void createAdminAccount(Admin admin) {
        adminsList.add(admin);
    }

    public static boolean Userslogin(String username, String password) {
        for(User user : usersList){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public static boolean Adminslogin(String username, String password) {
        for(Admin admin : adminsList){
            if(admin.getUsername().equals(username) && admin.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public static void logout() {
        Main.START();
    }

    public static ArrayList<TVShow> searchByTitle(String title){
        ArrayList<TVShow> found = new ArrayList<TVShow>();
        for(TVShow tvshow: TVshowList){
            if(TVshowList.contains(title)){
                found.add(tvshow);
            }
        }
        return found;
    }

    public static ArrayList<TVShow> searchByGenre(String genre){
        ArrayList<TVShow> found = new ArrayList<TVShow>();
        for(TVShow tvshow: TVshowList){
            if(TVshowList.contains(genre)){
                found.add(tvshow);
            }
        }
        return found;
    }

    public static ArrayList<TVShow> searchByReleaseYear(int year) {
        ArrayList<TVShow> found = new ArrayList<TVShow>();
        for(TVShow tvshow: TVshowList){
            if(TVshowList.contains(year)){
                found.add(tvshow);
            }
        }
        return found;
    }

    public static void viewUsers() {
        String data;
        for(User user : usersList){
            data = user.getUsername() ;
            System.out.println(data);
        }
    }

    public static void viewTvshows() {
        String data;
        for(TVShow tvShow : TVshowList){
            data = tvShow.getTitle() + "/ " + tvShow.getYear() ;
            System.out.println(data);
        }
    }

    public static void viewMovies() {
        String data;
        for(Movie movie : movieList){
            data = movie.getTitle() + "/ " + movie.getYear() ;
            System.out.println(data);
        }
    }
}

