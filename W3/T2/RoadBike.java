public class RoadBike extends Bicycle{
    // In millimeters (mm)
    private int tireWidth;

    public RoadBike(int startCadence,
                    int startSpeed,
                    int startGear,
                    int newTireWidth){
        super(startCadence,
              startSpeed,
              startGear);
        this.setTireWidth(newTireWidth);
    }

    public int getTireWidth(){
      return this.tireWidth;
    }

    public void setTireWidth(int newTireWidth){
        this.tireWidth = newTireWidth;
    }

    @Override
    public void printDescription(){
        super.printDescription();
        System.out.println("The RoadBike" + " has " + getTireWidth() +
            " MM tires.");
    }
    @Override
    public boolean equals(Object other) {
        RoadBike temp = (RoadBike) other;
        if (super.equals(other) & temp.tireWidth == this.tireWidth) {
            return true;
        }

        else return false;
    }
    @Override
    public int hashCode() {
        return super.hashCode() + tireWidth * 7;
    }
}