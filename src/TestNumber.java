public class TestNumber {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i < 101) {
            if (i % 2 == 0) {
                System.out.println("Show even numbers between 0 to 100: " + i);
                sum = sum + i;
                System.out.println("Sume of even numbers: " + sum);
            }
            i++;
        }
    }
}
