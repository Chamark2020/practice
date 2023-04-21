package lesson01;

class IsPrime {
    public static void main(String[] args) {
        // 1st way
     /*   for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
        }
*/
        //2nd way

        outto:
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    continue outto;
            }
            System.out.println(i);
        }
    }
}
