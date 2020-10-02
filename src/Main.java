/**
 * Muhammad Ibrahim
 * Band Booster Lab
 * 23 September 2020
 * EXTRA: Ask the user for the number of boosters
 **/

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String args[]){
        int boosterNum, weeks, boxesSold;

        //ask the user for number of boosters
        System.out.println("How many boosters worked in the fundraiser?");
        boosterNum = in.nextInt();

        //array for boosters
        BandBooster[] boosters = new BandBooster[boosterNum];

        System.out.println();
        //for loop to create boosters
        for (int i = 0;  i < boosterNum; i++) {
            System.out.print("Enter name of booster " + (i+1) + ":   ");
            boosters[i] = new BandBooster(in.next());
        }

        //ask for number of weeks
        System.out.println("\nHow many weeks will the fundraiser last?");
        weeks = in.nextInt();

        //for loop asking user about each week
        for (int i = 0; i < weeks; i++) {
            System.out.println("\nWeek " + (i+1) + ":\n");
            for (int j = 0; j < boosters.length; j++) {
                System.out.print("Enter number of boxes sold by "+ boosters[j].getName() + " this week:   ");
                boxesSold = in.nextInt();
                boosters[j].updateSales(boxesSold);
            }
        }

        System.out.println("Total Sales:\n");
        //loop to print the booster's sales
        for (int i = 0; i < boosters.length; i++) {
            System.out.println(boosters[i]);
        }
    }
}
