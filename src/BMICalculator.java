import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMICalculator {
    public static void main(String[] args) throws IOException {

        float heightBielecki, weightBielecki , bmiBielecki;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program will calculate your BMI");
        System.out.println("Enter your height in cm (and press Enter): ");
        heightBielecki = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight (and press Enter): ");
        weightBielecki = Float.parseFloat(br.readLine());

        bmiBielecki = (float) (weightBielecki / (Math.pow(heightBielecki, 2)));
        System.out.printf("Your BMI is: " + "%2.2f, \n", bmiBielecki);

        if(bmiBielecki<16){
            System.out.println("You are starving");
        } else if((bmiBielecki >= 16)&&(bmiBielecki < 16.99)){
            System.out.println("You're emaciated");
        } else if((bmiBielecki >= 17)&&(bmiBielecki < 18.49)){
            System.out.println("You're underweight");
        } else if((bmiBielecki >= 18.50)&&(bmiBielecki < 22.99)){
            System.out.println("You are in the low range of the norm");
        } else if((bmiBielecki >= 23)&&(bmiBielecki < 24.99)){
            System.out.println("You're in the high range of the norm");
        } else if((bmiBielecki >= 25)&&(bmiBielecki < 27.49)){
            System.out.println("You are overweight (pre-obese)");
        } else if((bmiBielecki >= 27.50)&&(bmiBielecki < 29.99)){
            System.out.println("You're overweight");
        } else if((bmiBielecki >= 30)&&(bmiBielecki < 34.99)){
            System.out.println("You have 1st degree obesity");
        } else if((bmiBielecki >= 35)&&(bmiBielecki < 39.99)){
            System.out.println("You have 2nd degree obesity");
        } else if((bmiBielecki > 40)){
            System.out.println("You have 3rd degree obesity");
        }

    }
}
