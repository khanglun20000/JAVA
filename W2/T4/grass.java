import java.util.Objects;
import java.util.Scanner;

public class grass { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cost = sc.nextDouble();
        int lawn = sc.nextInt();
        double width[] = new double[lawn];
        double length[] = new double[lawn];

        for (int i = 0; i < lawn; i++) {
            width[i] = sc.nextDouble();
            length[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < lawn; i++) {
            double area = width[i] * length[i];
            sum += area*cost;
        }

        System.out.printf("%.7f",sum);
        
    }
}
