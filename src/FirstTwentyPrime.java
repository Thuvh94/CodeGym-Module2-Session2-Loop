import java.util.Scanner;

public class FirstTwentyPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert limit");
        int limit = scanner.nextInt();
        int count=1;
        int number = 2;
        while (count <= limit) {
            if (isPrime(number)) {
                System.out.print(number+" ");
                count++;
            }
            number++;
        }
    }

    static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}


