package testpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import static testpackage.Main.balance;
public class Game
{
    private static String lottery;
    private Random rand = new Random();
    private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

    public Game() throws IOException
    {
        while (true)
        {

            lottery = String.valueOf(rand.nextInt(15));
            System.out.println("");
            System.out.println("Your balance is: $" + balance);
            System.out.println("___________________________");
            System.out.println("");
            System.out.print("Write your lucky ticket: ");
            String play_input = rd.readLine();
            balance -= 2000;
            System.out.println("Your balance is: $" + balance);
            System.out.println("___________________________");

            if (play_input.equals(lottery))
            {
                System.out.println("You've typed " + play_input + " = " + "Lottery ticket " + lottery);
                System.out.println("You've won!");
                balance += 125000;
            } else
            {
                System.out.println("You've typed " + play_input + " = " + "Lottery ticket " + lottery);
                System.out.println("You've lost");
                System.out.println("Try another one time!");
            }
        }
    }
}
