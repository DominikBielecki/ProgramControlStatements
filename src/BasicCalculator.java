import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicCalculator {
    public static void main(String[] args) throws IOException {

        float firstNumberBielecki, secondNumberBielecki, sum, substraction, product, quotient;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program calculates sum, difference, product and quotient for two numbers.");
        System.out.println("Enter the first number (and press Enter): ");
        firstNumberBielecki = Float.parseFloat(br.readLine());
        System.out.println("Enter the second number (and press Enter): ");
        secondNumberBielecki = Float.parseFloat(br.readLine());

        sum = firstNumberBielecki + secondNumberBielecki;
        substraction = firstNumberBielecki - secondNumberBielecki;
        product = firstNumberBielecki * secondNumberBielecki;
        quotient = firstNumberBielecki / secondNumberBielecki;

        System.out.printf("You entered two numbers, the first is: " + "%2.2f", firstNumberBielecki);
        System.out.printf(" and the second is: " + "%2.2f", secondNumberBielecki);

        System.out.println(); //blank line

        System.out.printf("Sum = " + "%2.2f, \n", + sum);
        System.out.printf("Difference = " + "%2.2f, \n", + substraction);
        System.out.printf("Product = " + "%2.2f, \n", + product);
        System.out.printf("Quotient = " + "%2.2f, \n", + quotient);
    }
}
