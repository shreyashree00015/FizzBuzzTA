package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i=1;
        while( i < 100) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {
                //final results
                System.out.println("Fizz Buzz!!!!");

            } else if (divisibleBy3) {
                //final results
                System.out.println("Fizz");

            } else if (divisibleBy5) {
                //final results
                System.out.println("Buzz");

            } else {
                //final results
                System.out.println(i);
            }
            i++;
        }
    }
}
