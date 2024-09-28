import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int userAge;
            System.out.print("Welcome to the theater. Please enter your age: ");
            if(in.hasNextInt())
            {
                userAge = in.nextInt();
                if(userAge >= 21)
                {
                    System.out.print("Your age is sufficient. I bestow upon thee a wristband crafted from the finest of recycled paper.");

                }
            }
    }
}