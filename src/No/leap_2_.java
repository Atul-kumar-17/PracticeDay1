package No;

import java.util.Scanner;

public class leap_2_ {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the starting year ");
        int startYear = Sc.nextInt();
        System.out.println("Enter the Ending year ");
        int endYear = Sc.nextInt();
        int leap =0;
        for (int i =startYear; i<endYear;i++){
            if(i%4 == 0){
                leap++;
            }

        }
        System.out.println("Number of leap years = " +leap);
    }
}
