//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;  // before the class at top of the file
public class BirthMonth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);  // create a Scanner in to read from the console

        int numMonth = 0; //user's entered number

        System.out.println("Enter your birth month as a number");
        if(in.hasNextInt())
        {
            // OK safe to read in a double
            numMonth = in.nextInt();
            in.nextLine(); // clear the buffer
        }
        if(numMonth > 12)
        {
            System.out.println("You entered "+numMonth+". This is not an accepted number");
        }
        else if(numMonth<1)
        {
            System.out.println("You eneterd "+numMonth+". This is not an accepted number");
        }
        else
        {
            System.out.println("Your birth month is :"+numMonth);
        }
    }
}