package testpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static String my_command;
    public static int balance = 15000;

    public static void main(String[] args) throws IOException
    {
            try
            {
                System.out.println("What do you want to do?");
                my_command = reader.readLine();
                if (my_command.equals("to play"))
                    new Game();
                else
                    System.out.println("Unknown command");

                    System.out.println("----------------------");
                    System.out.println("");
            }
            catch (Exception e)
            {
                System.out.println("Unknown error.");
            }
    }
}