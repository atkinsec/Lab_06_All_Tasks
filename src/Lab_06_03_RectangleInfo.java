import java.util.Scanner;

public class Lab_06_03_RectangleInfo {
    public static void main(String[] args)
    {
        int w = 0;
        int l = 0;
        double c;
        int area;
        int perimeter;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Side 1 width: ");

        if(in.hasNextInt())
        {
            w = in.nextInt();
            System.out.println("Enter Side 2 length: ");
            if(in.hasNextInt())
            {
                l = in.nextInt();
                perimeter = (w + l) * 2;
                area = w * l;
                c = Math.sqrt((w * w) + (l * l));

                System.out.println("Your perimeter is: " + perimeter + " units");
                System.out.println("Your area is: " + area + " units squared");
                System.out.println("Your diagonal is: " + c + " units");
            }
            else
                System.out.println("error, invalid response.");
        }
        else
            System.out.println("error, invalid response.");

    }
}
