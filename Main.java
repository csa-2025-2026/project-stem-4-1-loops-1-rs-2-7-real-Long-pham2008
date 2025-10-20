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

    // Problem 2
    System.out.println("How many numbers do you want to input");
    int N = input.nextInt();
    int counter = 0;
    int userInput;
    int max = Integer.MIN_VALUE;
    while (counter < N)
    {
      userInput = input.nextInt();
      if (userInput > max)
      {
        max = userInput;
      }
      counter ++;
    }
    System.out.println("The max number is " + max);
    input.close();
    
    


  }
}

