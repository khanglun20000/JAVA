public class Bicycle implements 
                        Cloneable {
        
    // the Bicycle class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
    public void printDescription(){
        System.out.println("\nBike is " + "in gear " + this.gear
            + " with a cadence of " + this.cadence +
            " and travelling at a speed of " + this.speed + ". ");
    }

    @Override
    public Object clone() {
        try{  
            return super.clone();  
        }catch(Exception e){ 
            return null; 
        }
    }

    @Override
    public boolean equals(Object other) {
        Bicycle otherBike = (Bicycle) other;
        if (this.cadence == otherBike.cadence &
            this.gear == otherBike.gear) {
                return true;
            }

        else return false;
    }

    @Override
    public int hashCode() {
        int res = this.cadence * 23 + this.gear * 37;
        return res;
    }
        
}