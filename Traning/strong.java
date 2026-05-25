package Traning;

public class strong {
   static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
    public static void main(String[] args) {

        int number = 145, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += factorial(remainder);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an strong number.");
        else
            System.out.println(number + " is not an strong number.");
    }
}
