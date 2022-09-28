import java.util.Scanner;

public class metric {
    public static void main(String[] args)
    {
        int measurement = 0;
        double miles;
        double feet;
        double inches;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your measurement in Meters: ");

        if(in.hasNextInt())
        {
            measurement = in.nextInt();
            miles = measurement / 1609.34;
            feet = measurement / 3.281;
            inches = measurement * 39.37;

            System.out.println("Your measurement in miles is: " + String.format("%.2f", miles) + " miles");
            System.out.println("Your measurement in feet is: " + String.format("%.2f", feet) + " feet");
            System.out.println("Your measurement in inches is: " + String.format("%.2f", inches) + " inches");
        }
        else
            System.out.println("error, invalid response.");



    }
}
