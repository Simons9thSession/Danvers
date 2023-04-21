import java.util.Scanner;
import java.applet.*;
import java.awt.*;
public class Attempt2 extends Applet 
{
    public void init(String[] args){
        String input;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the secret word: ");
        input = keyboard.nextLine();

        if (input.equalsIgnoreCase("OMieDeGolanie"))
        {
            System.out.println("Congratulations! " +
            "You have " + "logged in" + " successfully");
        }
        else
        {
            System.out.println("Wrong password! " + 
            "Better luck" + " next time");
        }

    }
}