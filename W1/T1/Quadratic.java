public class Quadratic {
    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        double discriminant = b*b - 4.0*c;
        if (discriminant > 0) {

            
            double sqroot =  Math.sqrt(discriminant);

            double root1 = (-b + sqroot) / 2.0;
            double root2 = (-b - sqroot) / 2.0;

            System.out.println(root1);
            System.out.println(root2);
        }
        else if(discriminant == 0) {
            double root = -b/2.0;
            
            System.out.println(root);
        }
        else {
            System.out.println("No solution");
        }
    }

    
}
