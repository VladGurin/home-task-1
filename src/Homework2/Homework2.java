package Homework2;

public class Homework2 {
    public static void main(String[] args) {

        int number = 347693485;
        int rest;
        while (number > 0) {
            rest = number % 10;
            if (rest % (2 * 3) == 0) {
                System.out.println("FizzBuzz");
            } else if (rest % (2) == 0) {
                System.out.println("Fizz");
            } else if (rest % (3) == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(rest);
            number = number / 10;
        }
    }
}
