package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Movie lalaland = new Movie(0);
        Movie WonderWoman = new Movie(1);
        Movie Avengers = new Movie(2);
        System.out.println("Hello and welcome to the information giver on a total of three movies cause Eric is very lazy. So to get a ton of info on a movie type it's corresponding number, 1. La La Land, 2. Wonder Woman, 3. Avengers");
        int temp = input.nextInt();
        if (temp == 1)
            lalaland.printTheJunk();
        else if (temp == 2)
            WonderWoman.printTheJunk();
        else
            Avengers.printTheJunk();

    }
}


