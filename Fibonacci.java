public class Fibonacci {
    public static void main(String[] args) {
        int n = 7; // You can change the number of terms you want to generate
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
