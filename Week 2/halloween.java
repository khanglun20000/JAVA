import java.util.Objects;
import java.util.Scanner;

public class halloween { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month = sc.next();
        int date = sc.nextInt();

        if (Objects.equals(month, "OCT")) {
            if (date == 31) {
                System.out.println("yup");
            }
            else System.out.println("nope");
        }
        else if (Objects.equals(month, "DEC")) {
            if (date == 25) {
                System.out.println("yup");
            }
            else System.out.println("nope");
        }
        else System.out.println("nope");
    }
}
