public class SumEvenNumbers {
    public static void main(String[] args) {

        int i, suma = 0;

        System.out.println("We calculate the sum of even numbers from 1 to 100.");

        for(i = 1; i <=100; i++){
            if(i%2 == 0) {
                suma += i; //so sum = sum + i;
            }
        }
        System.out.println("The sum of the even numbers from 1 to 100 is: " + suma);
    }
}
