public class RectanglePlus 
    implements Relatable, Cloneable {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
    }
    public RectanglePlus(Point p) {
        origin = p;
    }
    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.xCoordinate = x;
        origin.yCoordinate = y;
    }

    // a method for computing
    // the area of the rectangle
    public int getArea() {
        return width * height;
    }
    
    // a method required to implement
    // the Relatable interface
    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect 
            = (RectanglePlus)other;
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;               
    }

    public Object clone(){  
        try{  
            return super.clone();  
        }catch(Exception e){ 
            return null; 
        }
    }

    @Override
    public boolean equals(Object other) {
        RectanglePlus otherBike = (RectanglePlus) other;
        if (this.getArea() == otherBike.getArea()) {
                return true;
            }

        else return false;
    }

    @Override
    public int hashCode() {
        int res = this.getArea() * 113;
        return res;
    }
}