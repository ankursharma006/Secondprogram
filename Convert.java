import java.util.Scanner;

public class Convert{
    public static void main(String[] strings) {
        double minutesintoyear = 60*365*24;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesintoyear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
        
    }


}