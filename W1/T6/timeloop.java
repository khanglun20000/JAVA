public class timeloop {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        for (int i = 0; i < n; i++) {
            if (i == 100) {
                break;
            }
            System.out.println((i+1) + " Abracadabra");
        }
    }
}