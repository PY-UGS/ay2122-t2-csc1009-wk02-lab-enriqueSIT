
import java.util.*;

/*
Chinese Zodiac Calculation: Now let us write a program to find out the Chinese Zodiac sign for
a given year. The Chinese Zodiac is based on a twelve-year cycle, with each year represented
by an animal- monkey, rooster, dog, pig, rat, ox, tiger, rabbit, dragon, snake, horse, or sheep—
in this cycle, as shown in Figure 2.

Note that year % 12 determines the Zodiac sign. 1900 is the year of the rat because 1900 %
12 is 4. Listing 3.9 gives a program that prompts the user to enter a year and displays the
animal for the year.
*/


public class Q4 {
    
    public static void main(String args[]) {
        
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a year: ");
        // Scans the next token of the input as an int.
        int year = reader.nextInt();
        reader.close();
        int zodiacYear = year % 12;
        
        switch (zodiacYear) {
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Rat");
                break;
            case 5:
                System.out.println("Ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
            default:
                System.out.println("Warning, invalid year detected: " + zodiacYear);
                break;
        }

    }
}
