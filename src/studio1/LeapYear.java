package studio1;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] arg) {
        System.out.println("What year?");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        boolean tf;
        if (year % 4 == 0 && year % 100 != 0) {
            tf = true;
        } else if (year % 100 == 0 && year % 400 == 0){
            tf = true;
        } else {
            tf = false;
        }
        System.out.println(year + " is a leap year: " + tf);

}
}