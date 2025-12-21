public class ArmstrongNumRange {

    public static void main(String[] args) {

        System.out.println("Armstrong numbers between 1 and 100:");

        for (int number = 1; number <= 100; number++) {
            int original = number;
            int sum = 0;

            while (number > 0) {
                int digit = number % 10;
                sum += digit * digit * digit; // cube of digit
                number /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }

            number = original; // restore number
        }
    }
}
