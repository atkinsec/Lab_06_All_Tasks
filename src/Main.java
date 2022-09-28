import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double fahrenheit;
        double celsius;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your temp in celsius: ");

        if (in.hasNextDouble())
        {
            celsius = in.nextDouble();
            fahrenheit = (celsius * (1.8)) + 32;

            if (fahrenheit <= 32)
            {
                System.out.println("Your temp in fahrenheit is: " + fahrenheit + " degrees and is freezing.");
            }
            else if (fahrenheit >= 212)
            {
                System.out.println("Your temp in fahrenheit is: " + fahrenheit + " degrees and is boiling.");
            }
            else
                System.out.println("Your temp in fahrenheit is: " + fahrenheit);
        }
        else
            System.out.println("Bad input, try again.");
    }
}