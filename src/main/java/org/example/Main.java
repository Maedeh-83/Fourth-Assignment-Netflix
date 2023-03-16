package org.example;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static NetflixService netflixService = new NetflixService();


    public static void START() {
        System.out.println("Hi, wellcome to my own Netflix!");
        System.out.println("َAre you an user(1) or an admin(2)?");
        System.out.println("please enter a number...");
        int role = input.nextInt();
        switch (role) {
            case 1:
                String username;
                String password;
                Scanner input = new Scanner(System.in);
                System.out.println("Have you an account?");
                System.out.println("1-Yes   2-No");
                int answer = input.nextInt();
                if(answer==1) {
                    System.out.println("Login:");
                    System.out.println("Enter Username:");
                    username = input.next();
                    System.out.println("Enter password:");
                    password = input.next();
                    if (NetflixService.Userslogin(username, password)) {
                        System.out.println("you logged in!");
                        userPanel();
                    } else {
                        System.out.println("user not found!");
                        Main.START();
                    }
                }
                if(answer==2){
                    System.out.println("Creating a new account:");
                    System.out.println("Enter username:");
                    username = input.next();
                    System.out.println("Enter password:");
                    password = input.next();
                    User newAccont = new User(username, password);
                    NetflixService.createUserAccount(newAccont);
                    System.out.println("your account created succefully!");
                    System.out.println("Do you want to continue(1) or get out(2)?");
                    int answer1= input.nextInt();
                    if(answer1==1){
                        userPanel();
                    }
                    if (answer1==2){
                        START();
                    }
                }

                break;



            case 2:
                String username1;
                String password1;
                Scanner input1 = new Scanner(System.in);
                System.out.println("Admin Login:");
                System.out.println("Enter Username:");
                username = input1.next();
                System.out.println("Enter password:");
                password = input1.next();
                if (NetflixService.Adminslogin(username, password)) {
                        System.out.println("you logged in!");
                        adminPanel();
                    }
                else {
                        System.out.println("admin not found!");
                        Main.START();
                    }


                break;


            default:
                System.out.println("Wrong Input!");

        }
    }

    public static void userPanel() {

        System.out.println("Enter your desired option:");

        System.out.println("1.Search tvshows");
        System.out.println("2.Add to favorite list");
        System.out.println("3.Search favorite list");
        System.out.println("4.View the list of favorites");
        System.out.println("5.Get Recommendations");
        System.out.println("6.Logout");

        int option = input.nextInt();

        switch (option) {

            case 1:    //Search tvshows
                System.out.println("search in which category?");
                System.out.println("1.searchByTitle");
                System.out.println("2.searchByGenre");
                System.out.println("3.searchByReleaseYear");
                int category = input.nextInt();
                switch (category) {
                    case 1:     //searchByTitle
                        System.out.println("Enter your tvshow name:");
                        String name = input.next();
                        NetflixService.searchByTitle(name);
                        userPanel();
                        break;

                    case 2:     //searchByGenre
                        System.out.println("Enter your desired genre:");
                        String genre = input.next();
                        NetflixService.searchByGenre(genre);
                        userPanel();
                         break;

                    case 3:     //searchByReleaseYear
                        System.out.println("Enter your desired year:");
                        int year = input.nextInt();
                        NetflixService.searchByReleaseYear(year);
                        userPanel();
                        break;
                }
                break;

            case 2:   //Add to favorite list
                System.out.println("Enter your tvshow name:");
                String tvshowName = input.next();
                System.out.println("Enter your tvshow genre:");
                String tvshowGenre = input.next();
                System.out.println("Enter your tvshow ReleaseYear:");
                int tvshowYear = input.nextInt();
                System.out.println("Enter your tvshow Duration:");
                double tvshowDuration = input.nextDouble();
                System.out.println("Enter your tvshow rating:");
                double tvshowRating = input.nextDouble();

                TVShow tvShow = new TVShow(tvshowName, tvshowGenre, tvshowYear, tvshowDuration, tvshowRating);
                User.addToFavorites(tvShow);
                System.out.println("tvshow Has Been Successfully Added to favorite list!");

                userPanel();
                break;



            case 3:    //Search favorite list
                System.out.println("search in which category?");
                System.out.println("1.searchByTitle");
                System.out.println("2.searchByGenre");
                System.out.println("3.searchByReleaseYear");
                int category1 = input.nextInt();
                switch (category1) {
                    case 1:     //searchByTitle
                        System.out.println("Enter your tvshow name:");
                        String name = input.next();
                        User.searchByTitle(name);
                        userPanel();
                        break;

                    case 2:     //searchByGenre
                        System.out.println("Enter your desired genre:");
                        String genre = input.next();
                        User.searchByGenre(genre);
                        userPanel();
                        break;

                    case 3:     //searchByReleaseYear
                        System.out.println("Enter your desired year:");
                        int year = input.nextInt();
                        User.searchByReleaseYear(year);
                        userPanel();
                        break;
                }
                break;

            case 4:     //View the list of favorites
                User.viewFavorites();
                userPanel();
                break;


            case 5:   //getRecommendations
                System.out.println("Enter your tvshow name that you recomm:");
                String tvshowName1 = input.next();
                User.getRecommendations(tvshowName1);
                System.out.println("Thank you for your suggestion!");
                userPanel();
                break;

            case 6:    //Logout
                NetflixService.logout();
                break;


        }

    }

    public static void adminPanel() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your desired option:");
        System.out.println("1.Add a new account");
        System.out.println("2.Add tvshow");
        System.out.println("3.Add movie ");
        System.out.println("4.View users");
        System.out.println("5.View the list of tvshows");
        System.out.println("6.View the list of movies");
        System.out.println("7.Logout");

        String username;
        String password;

        int option = input.nextInt();

        switch (option) {

            case 1:   //Add a new account
                System.out.println("Enter username:");
                username = input.next();
                System.out.println("Enter password:");
                password = input.next();
                User newAccont = new User(username, password);
                NetflixService.createUserAccount(newAccont);
                System.out.println("new accont Has Been Successfully Added to users list!");

                adminPanel();
                break;

            case 2:   //Add tvshow
                System.out.println("Enter title:");
                String title = input.next();
                System.out.println("Enter genre:");
                String genre = input.next();
                System.out.println("Enter ReleaseYear:");
                int releaseYear = input.nextInt();
                System.out.println("Enter duration:");
                double duration = input.nextDouble();
                System.out.println("Enter rating:");
                double rating = input.nextDouble();

                TVShow newTvshow = new TVShow(title, genre, releaseYear, duration, rating);
                NetflixService.addTVShow(newTvshow);
                System.out.println("new tvshow Has Been Successfully Added to tvshow list!");

                adminPanel();
                break;

            case 3:    //Add movie
                System.out.println("Enter title:");
                String title1 = input.next();
                System.out.println("Enter genre:");
                String genre1 = input.next();
                System.out.println("Enter ReleaseYear:");
                int releaseYear1 = input.nextInt();
                System.out.println("Enter duration:");
                double duration1 = input.nextDouble();
                System.out.println("Enter rating:");
                double rating1 = input.nextDouble();
                System.out.println("Enter quality:");
                int quality = input.nextInt();
                System.out.println("Enter country:");
                String country = input.next();
                System.out.println("Enter ageGrade:");
                int ageGrade = input.nextInt();
                System.out.println("Enter synopsis:");
                String synopsis = input.next();

                Movie newMovie = new Movie(title1, genre1, releaseYear1, duration1, rating1, quality, country, ageGrade, synopsis);
                NetflixService.addMovie(newMovie);
                System.out.println("new movie Has Been Successfully Added to movie list!");

                adminPanel();
                break;

            case 4:   //View users
                NetflixService.viewUsers();
                adminPanel();
                break;

            case 5:   //View the list of tvshows
                NetflixService.viewTvshows();
                adminPanel();
                break;

            case 6:   //View the list of movies
                NetflixService.viewMovies();
                adminPanel();
                break;

            case 7:   //Logout
                Main.START();


            default:
                System.out.println("Wrong Input!");
        }


    }


    public static void main(String[] args) {
        TVShow tvShow1 = new TVShow("Game of Thrones", "Action", 2011, 57, 9.2);
        TVShow tvShow2 = new TVShow("13 Reasons Why", "Drama", 2017, 60, 7.5);
        TVShow tvShow3 = new TVShow("Sherlock", "Crime", 2010, 88, 9.1);
        TVShow tvShow4 = new TVShow("Goblin", "Romance", 2016, 75, 8.6);
        TVShow tvShow5 = new TVShow("Crash landing on you", "Romance", 2019, 80, 8.7);
        TVShow tvShow6 = new TVShow("25,21", "Drama", 2022, 60, 8.8);
        TVShow tvShow7 = new TVShow("Ginny&Georgia", "Drama", 2021, 50, 7.4);

        NetflixService.addTVShow(tvShow1);
        NetflixService.addTVShow(tvShow2);
        NetflixService.addTVShow(tvShow3);
        NetflixService.addTVShow(tvShow4);
        NetflixService.addTVShow(tvShow5);
        NetflixService.addTVShow(tvShow6);
        NetflixService.addTVShow(tvShow7);

        Movie movie1 = new Movie("Me before you", "Romance", 2016, 110, 7.4, 720, "UK", 13, "A girl in a small town forms an unlikely bond with a recently-paralyzed man she's taking care of.");
        Movie movie2 = new Movie("Interstellar", "Adventure", 2014, 170, 8.6, 1080, "USA", 13, "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.");
        Movie movie3 = new Movie("The Matrix", "Action", 1999, 136, 8.7, 360, "USA, Australia", 13, "When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence.");
        Movie movie4 = new Movie("Harry Potter", "Adventure", 2001, 152, 7.6, 480, "UK", 7, "An orphaned boy enrolls in a school of wizardry, where he learns the truth about himself, his family and the terrible evil that haunts the magical world");
        Movie movie5 = new Movie("Avengers", "Action", 2019, 180, 8.4, 720, "USA", 13, "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.");

        NetflixService.addMovie(movie1);
        NetflixService.addMovie(movie2);
        NetflixService.addMovie(movie3);
        NetflixService.addMovie(movie4);
        NetflixService.addMovie(movie5);

        User user1 = new User("Maedeh", "123");
        User user2 = new User("Roohi", "1234");
        User user3 = new User("Fati", "12345");
        User user4 = new User("Diba", "123456");
        User user5 = new User("Saeed", "1234567");
        User user6 = new User("Nobody", "12345678");

        NetflixService.createUserAccount(user1);
        NetflixService.createUserAccount(user2);
        NetflixService.createUserAccount(user3);
        NetflixService.createUserAccount(user4);
        NetflixService.createUserAccount(user5);
        NetflixService.createUserAccount(user6);

        Admin admin1 = new Admin("A1", "111");
        Admin admin2 = new Admin("A2", "222");
        Admin admin3 = new Admin("A3", "333");

        NetflixService.createAdminAccount(admin1);
        NetflixService.createAdminAccount(admin2);
        NetflixService.createAdminAccount(admin3);

        START();

    }

}


