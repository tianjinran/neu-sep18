import java.util.*;
import java.util.stream.IntStream;

public class Mreview implements Comparable<Mreview>
{
    // instance variables
    private String title;   // title of the movie
    private ArrayList<Integer> ratings; // list of ratings stored in a Store object

    //constructor
    public Mreview(){
        title = "";
        ratings = new ArrayList<>(0);
    }

    public Mreview(String ttl){
        title = ttl;
        ratings = new ArrayList<>(0);
    }
    public Mreview(String ttl, int firstRating){
        title = ttl;
        ratings = new ArrayList<>(0);
        ratings.add(firstRating);
    }

    //methods
    public String getTitle(){
        return title;
    }

    public void addRating(int r){
        ratings.add(r);
    }

    public double aveRating(){
        double sum = 0;
        for(int i : ratings){
            sum += i;
        }
        return sum/ratings.size();
    }

    public int numRatings(){
        return ratings.size();
    }

    public int compareTo(Mreview obj){
        return title.compareTo(obj.title);
    }

    public boolean equals(java.lang.Object obj){
        obj = new Mreview();
        if(this.title==((Mreview) obj).title) {
            return true;
        }
        return false;
    }

    public String toString(){
        return this.title + ", average " + this.aveRating() + " out of " + this.ratings + " ratings";
    }

    public static void main(String[] Args) {
        Mreview a = new Mreview("Kill Bill", 3);
        a.ratings.add(4);
        a.ratings.add(3);

        System.out.println("Ratings: " + a.ratings);
        System.out.println("Average rating: " + a.aveRating());

        System.out.println(a.toString());
    }
}
