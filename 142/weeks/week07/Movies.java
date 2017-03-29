/*
Sample Log of Execution
-----------------------
This program will allow you to search the
imdb top 250 movies for a particular phrase.

search phrase? 1939
#      Rating  Votes    Title
125    8.2     71603    Mr. Smith Goes to Washington (1939)
153    8.1     198675   Gone with the Wind (1939)
198    8.1     267922   The Wizard of Oz (1939)
3 matches

Second Log of Execution
-----------------------
This program will allow you to search the
imdb top 250 movies for a particular phrase.

search phrase? kill
#      Rating  Votes    Title
84     8.3     195506   To Kill a Mockingbird (1962)
168    8.1     671050   Kill Bill: Vol. 1 (2003)
2 matches

First 25 Lines of Data File imdb.txt
------------------------------------
1 1551650 9.2 The Shawshank Redemption (1994)
2 1062212 9.2 The Godfather (1972)
3 719359 9.0 The Godfather: Part II (1974)
4 1526941 8.9 The Dark Knight (2008)
5 402417 8.9 12 Angry Men (1957)
6 790006 8.9 Schindler's List (1993)
7 1209393 8.9 Pulp Fiction (1994)
8 463429 8.9 The Good, the Bad and the Ugly (1966)
9 1112800 8.9 The Lord of the Rings: The Return of the King (2003)
10 1225086 8.8 Fight Club (1999)
11 1137295 8.8 The Lord of the Rings: The Fellowship of the Ring (2001)
12 728094 8.7 Star Wars: Episode V - The Empire Strikes Back (1980)
13 1125145 8.7 Forrest Gump (1994)
14 1326186 8.7 Inception (2010)
15 626785 8.7 One Flew Over the Cuckoo's Nest (1975)
16 1003768 8.7 The Lord of the Rings: The Two Towers (2002)
17 667889 8.7 Goodfellas (1990)
18 1113401 8.7 The Matrix (1999)
19 798290 8.7 Star Wars (1977)
20 212328 8.7 Seven Samurai (1954)
21 491760 8.6 City of God (2002)
22 931535 8.6 Se7en (1995)
23 801208 8.6 The Silence of the Lambs (1991)
24 679822 8.6 The Usual Suspects (1995)
25 250094 8.6 It's a Wonderful Life (1946)

Program File Movies.java
------------------------ */
// This program prompts for a phrase and it prints all movies from the
// imdb top-250 database that contain the phrase.

import java.io.*;
import java.util.*;

public class Movies {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("imdb.txt"));
        Scanner console = new Scanner(System.in);
        giveIntro();
        System.out.print("search phrase? ");
        String phrase = console.nextLine().toLowerCase();

        String line = find(input, phrase);
        int count = 0;
        if (line.length() > 0) {
            System.out.println("#\tRating\tVotes\tTitle");
            while (line.length() > 0) {
                print(line);
                line = find(input, phrase);
                count++;
            }
        }
        System.out.println(count + " matches");
    }

    // introduces the program to the user
    public static void giveIntro() {
        System.out.println("This program will allow you to search the");
        System.out.println("imdb top 250 movies for a particular phrase.");
        System.out.println();
    }

    // searches for and returns the next line of the given input that contains
    // the given phrase; returns an empty string if not found
    public static String find(Scanner input, String phrase) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.toLowerCase().contains(phrase)) {
                return line;
            }
        }
        return "";
    }

    // Prints the rank, rating, votes, and title separated by tabs for the
    // given line of the input file
    public static void print(String line) {
        Scanner data = new Scanner(line);
        int rank = data.nextInt();
        int votes = data.nextInt();
        double rating = data.nextDouble();
        System.out.print(rank + "\t" + rating + "\t" + votes + "\t");
        while (data.hasNext()) {
            System.out.print(data.next() + " ");
        }
        System.out.println();
    }
}
