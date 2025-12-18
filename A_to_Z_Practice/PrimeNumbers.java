class PrimeNumbers {
    public static void main(String[] args) {

        int num, i, count;

        for (num = 2; num <= 100; num++) {
            count = 0;

            for (i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(num);
            }
        }
    }
}
