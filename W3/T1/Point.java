public class Point {
    int xCoordinate = 0;
    int yCoordinate = 0;
    
    public Point(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public void setX(int x) {
        this.xCoordinate = x;
    }

    public void setY(int y) {
        this.yCoordinate = y;
    }

    public int getX() {
        return this.xCoordinate;
    }

    public int getY() {
        return this.yCoordinate;
    }
}