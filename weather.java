import java.util.*;
import java.util.Scanner;

public class weather {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many days' temperature?");
        int days = keyboard.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for(int i=0;i<days;i++) {
            System.out.println("Day " + (i+1) + "'s high temp: ");
            temps[i] = keyboard.nextInt();
            sum += temps[i];
        }
        double average = (double) sum / days;
        int count = 0;
        for(int i =0;i<days;i++) {
            if(temps[i]>average) {
                count++;
            }
        }
        System.out.printf("Average temp = "+average);
        System.out.println();
        System.out.println(count + " day above average");
        
        System.out.println("Temperatures: " + Arrays.toString(temps));
        Arrays.sort(temps);
        System.out.println("Two coldest days: " + temps[0] + ", " + temps[1]);
        System.out.println("Two hottest days: " + temps[temps.length - 1] + ", " + temps[temps.length - 2]);
    }
}
