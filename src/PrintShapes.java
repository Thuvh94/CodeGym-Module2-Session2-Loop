import java.util.Scanner;

public class PrintShapes {
    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0) {
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("0.Exit");
            System.out.println("Insert the number you want");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String str = "";
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            str += "*";
                        }
                        str += "\n";
                    }
                    System.out.println(str);
                    break;
                case 2:
                    String tri = "";
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            tri += "*";
                        }
                        tri += "\n";
                    }
                    for (int i = 5; i > 0; i--) {
                        for (int j = i; j > 0; j--) {
                            tri += "*";
                        }
                        tri += "\n";
                    }
                    System.out.println(tri);
                    break;
                case 3:
                    String iso = "";
                    for (int i = 0; i < 7; i++) {
                        for (int j = 7 - i; j >= 0; j--) {
                            iso += " ";
                        }
                        for (int k = 14 - 2 * i; k <= 14; k++) {
                            iso += "*";
                        }
                        iso += "\n";
                    }
                    System.out.printf(iso);
                    break;
                case 0:
                    System.out.println("Bye bye!");
                    break;
            }
        }
    }
}

