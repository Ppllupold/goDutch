
import java.util.Scanner;
    public class goDutch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bill = scan.nextInt();
        int amountOfPeople = scan.nextInt();


        if(bill < 0) {
            System.out.println("Bill total amount  cannot be negative");
            System.exit(0);
        }
        if(amountOfPeople <= 0) {
            System.out.println("Number of friend cannot be negative or zero");
            System.exit(0);
        }
        int result = bill / amountOfPeople + bill / 10 / amountOfPeople;

        System.out.println(result);
    }
}
