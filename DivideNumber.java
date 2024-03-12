import java.util.Scanner;
public class DivideNumber
  {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int nume = sc.nextInt();
        System.out.println("Enter the denominator:");
        int denom = sc.nextInt();
        sc.close();
        try
          {
            double result = divideNumbers(nume, denom);
            System.out.println("Result: " + result);
          }
        catch (ArithmeticException e)
          {
            System.out.println("Error: " + e.getMessage());
          }
    }
    public static double divideNumbers(int nume, int denom) throws ArithmeticException
    {
        if (denom == 0)
        {
            throw new ArithmeticException("divide by zero is not possible.");
        }
        return (double) nume/ denom;
    }
}