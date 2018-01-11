package com.company;

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

    public int getRuntime() {
        return 0;
    }


    public int getRating() {
        return 0;
    }


    public int getAgeRequirement() {
        return 0;
    }


    public String[] getSoundtrack() {
        return new String[0];
    }


    public String[] getCredits() {
        return new String[0];
    }


    public String getTitle() {
        return null;
    }


    public String getCoverPhotoURL() {
        return null;
    }


    public String getGenre() {
        return null;
    }
}
