public class SumOfEven {
    public static void main(String[] args) {
        int i, sum=0;

        for (i=1; i<=100; i++) {
            if (i%2==0) {
                sum += i;
            }
        }
        System.out.println("The sum of even numbers from 1 upto 100 is equal to: " + sum);
    }
}
