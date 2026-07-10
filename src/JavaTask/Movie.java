package JavaTask;

public class Movie {
    int movieID;
    String movieName;
    String heroName;
    String directorName;
    int rating;
    Movie(int ID,String filmName,String actorName,String crewName,int imdb){
        movieID=ID;
        movieName=filmName;
        heroName=actorName;
        directorName=crewName;
        rating=imdb;
        System.out.println("movieID :" +movieID);
        System.out.println("movieName :" +movieName);
        System.out.println("heroName :" +heroName);
        System.out.println("directorName :" +directorName);
        System.out.println("rating :" +rating);
        System.out.println("--------------------------------");





    }

    static void main() {
        new Movie(123,"veer zarra","sharuk khan","yash chopra",8);
        new Movie(124,"rab ne bana di jodi","sharuk khan","yash chopra",9);
        new Movie(125,"my name is khan","sharuk khan","karan johar",7);


    }



}
