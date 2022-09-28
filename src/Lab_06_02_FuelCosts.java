import java.util.Scanner;

public class Lab_06_02_FuelCosts {
        public static void main(String[] args) {
                double gallons = 0;
                double efficiency = 0;
                double ppg = 0;
                double cost;
                double distance;

                Scanner in = new Scanner(System.in);

                System.out.println("Enter your gallons in tank: ");

                if (in.hasNextDouble())
                {
                        gallons = in.nextDouble();
                        System.out.println("Enter your fuel efficiency in MPG: ");

                        if(in.hasNextDouble())
                        {
                                efficiency = in.nextDouble();
                                System.out.println("Enter the price of gas, per gallon: ");

                                if(in.hasNextDouble())
                                {
                                        ppg = in.nextDouble();
                                        cost = (ppg * 100) / efficiency;
                                        System.out.println("Cost for 100 Miles in dollars is: " + String.format("%.2f", cost));

                                        distance = efficiency * gallons;
                                        System.out.println("Maximum distance with the gas in your car is: " + distance + " miles");
                                }
                                else
                                        System.out.println("error, invalid response.");
                        }
                        else
                                System.out.println("error, invalid response.");
                }
                else
                        System.out.println("error, invalid response.");


        }
}

