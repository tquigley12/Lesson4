package lesson4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the main class to execute the deliverables for Advanced Java Programming lesson 4
 * 
 * @author tquigley1
 */
public class Lesson4 {

    public static void main(String[] args) {
        new Lesson4();
    }
    
    public Lesson4() {
    /**
     * Logic to execute the first deliverable:
     * 
     * For this deliverable, we were provided the following:
     *      The Joshua Tree     9 March 1987
     *      Rattle and Hum      10 October 1988
     * 
     */
    
    // Calculate and print how many days, months and years have elapsed since
    // U2 released their album, The Joshua Tree.
    
    LocalDate JOSHUA_TREE_RELEASE = LocalDate.of(1987, Month.MARCH, 9);
    LocalDate RATTLE_AND_HUM_RELEASE = LocalDate.of(1988, Month.OCTOBER, 10);
    Period periodOfTime = Period.between(JOSHUA_TREE_RELEASE, LocalDate.now());
    System.out.println("It has been " + periodOfTime.getYears() + (periodOfTime.getYears() == 1 ? " year, " : " years, ") + 
            periodOfTime.getMonths() + (periodOfTime.getMonths() == 1 ? " month" : " months") + ", and " + periodOfTime.getDays() + 
            (periodOfTime.getDays() == 1 ? " day" : " days") + " since the release of Joshua Tree");

    // Calculate and print the amount of time between The Joshua Tree and their 
    // next album, Rattle and Hum.
    
    Period periodOfTime2 = Period.between(JOSHUA_TREE_RELEASE, RATTLE_AND_HUM_RELEASE);
    System.out.println("It was " + periodOfTime2.getYears() + (periodOfTime2.getYears() == 1 ? " year, " : " years, ") +
            periodOfTime2.getMonths() + (periodOfTime2.getMonths() == 1 ? " month" : " months") + ", and " + periodOfTime2.getDays() +
            (periodOfTime2.getDays() == 1 ? " day" : " days") + " between the release of Joshua Tree and the release of Rattle and Hum");
    
    // Calculate and print the release date for a third album that released the 
    // same amount of time after Rattle and Hum.
    
    System.out.println("If U2 released a third album in the same " +
            "time difference as between Joshua Tree and Rattle and Hum, it would have been " +
            "released on " + RATTLE_AND_HUM_RELEASE.plusYears(periodOfTime2.getYears()).plusMonths(periodOfTime2.getMonths()).plusDays(periodOfTime2.getDays()));
    
    /**
     * Logic to execute the second deliverable.
     * 
     * Create an enumerated type named Team that represents teams in an NBA Division (the Central Division).
     * Ask the user for their favorite team.
     * Use the first 3 characters of the response and look up on the enum to find either the city or the team name.
     * Return the team name and print out.
     */
    
    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner (System.in);
    
    // Get a partial name to search for, and print team name (if found).
    String lookUp = "", inputValue = "";
    System.out.print("Enter the first 3 characters of the city or team name to look up ");
    inputValue = keyboard.nextLine();
    
    while (inputValue.length() < 3) {
        System.out.println("Try again. Must enter at least 3 characters for search.");
        inputValue = keyboard.nextLine();
    }
    
    lookUp = inputValue.substring(0, 3);
    
    if (Team.BUCKS.getCity().substring(0, 3).equalsIgnoreCase(lookUp) ||
        Team.BUCKS.getTeam().substring(0, 3).equalsIgnoreCase(lookUp)) {
        System.out.println(Team.BUCKS);
    } else 
    if (Team.BULLS.getCity().substring(0, 3).equalsIgnoreCase(lookUp) ||
        Team.BULLS.getTeam().substring(0, 3).equalsIgnoreCase(lookUp)) {
        System.out.println(Team.BULLS);
    } else
    if (Team.CAVALIERS.getCity().substring(0, 3).equalsIgnoreCase(lookUp) ||
        Team.CAVALIERS.getTeam().substring(0, 3).equalsIgnoreCase(lookUp)) {
        System.out.println(Team.CAVALIERS);
    } else
    if (Team.PACERS.getCity().substring(0, 3).equalsIgnoreCase(lookUp) ||
        Team.PACERS.getTeam().substring(0, 3).equalsIgnoreCase(lookUp)) {
        System.out.println(Team.PACERS);
    } else
    if (Team.PISTONS.getCity().substring(0, 3).equalsIgnoreCase(lookUp) ||
        Team.PISTONS.getTeam().substring(0, 3).equalsIgnoreCase(lookUp)) {
        System.out.println(Team.PISTONS);
    } else {
        System.out.println("Team name not found");
    }

    /**
     * Logic to execute the third deliverable.
     * 
     * Create program logic that asks for user for a number.  Determine the smallest 
     * data type (having the least number of bits) in which the number could be stored.
     * The name of the data type should be printed.
     */
    
    String input2 = "";
    System.out.println("Enter a number");
    input2 = keyboard.nextLine();
    Long number = new Long(input2);
    
    System.out.print("Value " + number + " is a");
    if ((number <= Byte.MAX_VALUE) && (number >= Byte.MIN_VALUE)) {
        System.out.println(" BYTE");
    } else if ((number <= Short.MAX_VALUE) && (number >= Short.MIN_VALUE)) {
        System.out.println(" SHORT");
    } else if ((number <= Integer.MAX_VALUE) && (number >= Integer.MIN_VALUE)) {
        System.out.println("n INTEGER");
    } else {
        System.out.println(" LONG");
    }
    
    /**
     * Logic to execute the fourth deliverable.
     * 
     * Create program logic that calculates how many total letters would be written
     * if every person in Wisconsin wrote a letter to every person in California.
     * 
     * If a copy of every letter was made for every person in Texas, how many copies
     * would be made?  Print the total number of copies.
     * 
     * Print the total cost of copies made for Texans if copies cost $3.23 each.
     */
    
    final BigDecimal COST_PER_COPY = new BigDecimal("3.23");
    final BigInteger WISCONSIN_POPULATION = new BigInteger("5726398");
    final BigInteger CALIFORNIA_POPULATION = new BigInteger("38041430");
    final BigInteger TEXAS_POPULATION = new BigInteger("26059203");
    
    BigInteger total1;
    total1 = WISCONSIN_POPULATION.multiply(CALIFORNIA_POPULATION);
    
    System.out.println("If every person in Wisconsin wrote a letter to every person " +
            "in California, there would be " + total1 + " letters");
    
    BigInteger total2;
    total2 = total1.multiply(TEXAS_POPULATION);
    
    System.out.println("If a copy of every letter was made for every person in Texas " +
            "there would be " + total2 + " letters");
    
    BigDecimal cost1;
    BigDecimal total3 = new BigDecimal(total2);
    cost1 = total3.multiply(COST_PER_COPY);
    
    System.out.println("The total cost of the copies is: " + cost1);
    
    }
    
}
