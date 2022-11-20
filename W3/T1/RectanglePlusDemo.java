public class RectanglePlusDemo {
    public static void main(String[] args){
        Point p1 = new Point(5,1);
        RectanglePlus rec1 = new RectanglePlus(p1, 30, 5);

        Point p2 = new Point(10,2);
        RectanglePlus rec2 = new RectanglePlus(p2, 16, 8);


        if (rec1.isLargerThan(rec2)==1) {
            System.out.println("True rec1 is larger than rec2");
        }
        else System.out.println("False rec1 is smaller or equal than rec2");
        
        System.out.println(rec1.height);

        RectanglePlus rec3 = (RectanglePlus) rec1.clone();

        System.out.println(rec1.height);

        System.out.println(rec1.getClass());
        System.out.println(rec3.getClass());

        System.out.println(rec1.hashCode());
        System.out.println(rec3.hashCode());



    }
    
    
}
