import java.util.Scanner;

public class Main 
{
  public static void main(String[] args)
   {
    Scanner input = new Scanner(System.in);
    int number;
    int sum = 0;

    System.out.println("Enter any non-negative numbers. Enter -1 to finish.");

    while (true) 
    {
      System.out.print("Enter a number: ");
      number = input.nextInt();

      if (number == -1) 
      {
        break; 
      }

      if (number >= 0) 
      {
        sum += number; 
      } 
      else 
      {
        System.out.println("Negative numbers are not allowed (except -1 to stop).");
      }
    }

    System.out.println("The total sum is: " + sum);
    input.close();
  }
}