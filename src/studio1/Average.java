package studio1;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Type in your 2 integers");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        double avg = (double)(n1 + n2)/ 2;
        System.out.println("The average of " + n1 + " and " + n2 + " is " + avg);








    }




}
