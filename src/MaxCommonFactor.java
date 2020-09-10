import java.util.Scanner;
public class MaxCommonFactor {
    public static void main(String[] args) {
        int firstNum, secondNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert first number");
        firstNum = sc.nextInt();
        System.out.println("Insert second number");
        secondNum = sc.nextInt();
        firstNum = Math.abs(firstNum);
        secondNum = Math.abs(secondNum);

        if (firstNum == 0 || secondNum == 0)
            System.out.println("No greatest common factor");
        while (firstNum != secondNum){
            if (firstNum > secondNum)
                firstNum = firstNum - secondNum;
            else
                secondNum = secondNum - firstNum;
        }
        System.out.println("Greatest common factor: " + firstNum);
    }
}
