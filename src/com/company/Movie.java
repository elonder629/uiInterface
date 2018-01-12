package com.company;

import java.util.Arrays;

/**
 * Created by el693 on 1/11/18.
 */
public class Movie implements Movies {
public String[] titles = {"La La La Land", "Wonder Woman", "Avengers"};
    public String[] genre = {"Musical", "Action", "Action"};
    public String[] credits = {"Emma Stone, and Ryan Gosling", "Gal Gadot, Chris Pine", "Robert Downey Jr, Chris Evans, Mark Ruffalo, Chris Hemsworth, Scarllett Johansen, Jeremy Renner"};
    public int[] ratings = {10,10,10};
    public int[] runtime = {128,141,143};
    public int[] ageRequirement = {13,13,13};
    public String[] soundtracks = {"https://www.youtube.com/watch?v=MmKlaGpmYig"
            ,"https://www.youtube.com/watch?v=puEi1ZFPwFo&list=PLBKadB95sF46NHnrQyDN0kIbvk6dbiDhI"
            , "https://www.youtube.com/watch?v=sqx0ApdjvR8&list=PLIR18qtLNtiyCnPeHimoeHdV6YIUX4I8d"};
    public String[] coverPhoto = {"https://upload.wikimedia.org/wikipedia/en/a/ab/La_La_Land_%28film%29.png"
            ,"https://vignette.wikia.nocookie.net/dccu/images/6/6f/JL_Wonder_Woman.jpg/revision/latest?cb=20160914003449"
            ,"https://upload.wikimedia.org/wikipedia/en/f/f9/TheAvengers2012Poster.jpg"};
    public int id;
    public Movie(int ID){
        id = ID;
    }

    public int getRuntime() {
        return runtime[id];
    }


    public int getRating() {
        return ratings[id];
    }


    public int getAgeRequirement() {
        return ageRequirement[id];
    }


    public String[] getSoundtrack() {
        String[] temp = {soundtracks[id]};
        return temp;
    }


    public String[] getCredits() {
        String[] temp = {credits[id]};
        return temp;
    }


    public String getTitle() {
        return titles[id];
    }


    public String getCoverPhotoURL() {
        return coverPhoto[id];
    }


    public String getGenre() {
        return genre[id];
    }
    public void printTheJunk(){
        System.out.println(getTitle());
        System.out.println("Here is the runtime:" + getRuntime());
        System.out.println("Here is the age requirement: " + getAgeRequirement());
        System.out.println("Here is the rating out of 10: " + getRating());
        System.out.println("Here is the genre of the movie: " + getGenre());
        System.out.println("Here is the Credits of the movie: " + Arrays.toString(getCredits()));
        System.out.println("Here is the soundtrack: " + Arrays.toString(getSoundtrack()));
        System.out.println("Here is the cover photo: " + getCoverPhotoURL());
    }
}
