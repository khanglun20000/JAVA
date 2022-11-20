public class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(
               int startCadence,
               int startSpeed,
               int startGear,
               String suspensionType){
        super(startCadence,
              startSpeed,
              startGear);
        this.setSuspension(suspensionType);
    }

    public String getSuspension(){
      return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has a " +
            getSuspension() + " suspension.");
    }
    
    @Override
    public boolean equals(Object other) {
        MountainBike temp = (MountainBike) other;
        if (super.equals(other) & temp.suspension == this.suspension) {
            return true;
        }

        else return false;
    }
    @Override
    public int hashCode() {
        int sum = 0;
        for (int i = 0; i < this.suspension.length(); i++) {
            sum = sum + (int) this.suspension.charAt(i);
        }
        return super.hashCode() + sum * 7;
    }
}