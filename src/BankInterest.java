//Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
import java.util.Scanner;
public class BankInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert money amount: ");
        double money = scanner.nextDouble();
        System.out.println("Insert the bank rate in percentage: ");
        double rate = scanner.nextFloat();
        System.out.println("Insert your renting month");
        int month = scanner.nextInt();
        double total = 0;
        for(int i = 0; i < month; i++){
            total += money * (rate/100)/12 * month;
        }
        System.out.println("Total of interest: " + total);
    }
}
