import java.util.Scanner;

public class UnlockPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point[] pattern = new Point[9];

        int xOrd = 0, yOrd = 0;
        for(int i = 0; i < 9; i++){
            if(i % 3 == 0 && i!= 0){
                yOrd++;
            }
            pattern[i] = new Point(sc.nextInt(), xOrd++ % 3 , yOrd % 3);
        }

        Point temp = null;

        double length = 0;

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(pattern[j].data == i + 1){
                    if(i == 0){
                        temp = pattern[j];
                        break;
                    }
                    else{
                        length += temp.DistanceTo(pattern[j]);
                        temp = pattern[j];
                        break;
                    }
                }
            }
        }

        System.out.println(length);

    }

    public static class Point{
        public int data;
        public int x, y;
        public Point(int data, int x, int y){
            this.data = data;
            this.x = x;
            this.y = y;
        }

        public double DistanceTo(Point B){
            double distance = Math.sqrt(Math.pow(x - B.x, 2) + Math.pow(y - B.y, 2));
            return distance;
        }
    }
}

