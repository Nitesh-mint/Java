package OOP;
class movie {
    String title;
    String genre;
    float rating;

    void playit(){
        System.out.println("\n\n           The moive "+ title + " is playing now. \n");
    }

    void showDetails(){

        System.out.println("**********Showing the details of the movie**********");
        System.out.println("            The title: " + title);
        System.out.println("            The genre: " + genre);
        System.out.println("            The rating: " + rating);
    }
}

public class Movie{
    public static void main(String args[]){
        //cretaing no1 object
        movie no1 = new movie();
        no1.title = "Kabbadi Kabbadi Kabbadi";
        no1.genre  = "Love story";
        no1.rating = 9.7f;
        
        //creating no2 object
        movie no2 = new movie();
        no2.title = "Joker";
        no2.genre = "Suspense";
        no2.rating = 9.9f;

        no1.playit(); // calling playit method.
        no1.showDetails(); //calling showDetails method.

    }
}
