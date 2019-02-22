
package lesson4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * This is the main class to execute the deliverables for Advanced Java Programming lesson 4
 * 
 * @author tquigley1
 */
public class Lesson4 {

    /**
     * @param args the command line arguments
     */
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
    }
    
}
