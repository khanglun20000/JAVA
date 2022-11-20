public class TestBikes {
    public static void main(String[] args) {
        Bicycle thanhs = new Bicycle(10, 4, 2);
        MountainBike khangs = new MountainBike(2, 47, 1, "Spense");
        RoadBike quangs = new RoadBike(2, 30, 3, 29);

        thanhs.applyBrake(2);
        thanhs.printDescription();

        khangs.printDescription();
        quangs.printDescription();

        MountainBike hungs = (MountainBike) khangs.clone();
        RoadBike khoas = (RoadBike) quangs.clone();
        hungs.applyBrake(12);
        hungs.printDescription();

        System.out.println(thanhs.hashCode());
        System.out.println(khangs.hashCode());
        System.out.println(quangs.hashCode());
        System.out.println(hungs.hashCode());

        if(khangs.equals(hungs)) {
            System.out.println("Khang and Hung: True");
        }

        else System.out.println("Khang and Hung: False");

        hungs.setSuspension("LOL");


         if(khangs.equals(hungs)) {
            System.out.println("Khang and Hung: True");
        }

        else System.out.println("Khang and Hung: False");
        System.out.println(hungs.hashCode());
        System.out.println(khangs.hashCode());


        if(quangs.equals(khoas)) {
            System.out.println("Quang and Khoa: True");
        }

        else System.out.println("Quang and Khoa: False");
        System.out.println(quangs.hashCode());
        System.out.println(khoas.hashCode());

        quangs.setTireWidth(1000);

        if(quangs.equals(khoas)) {
            System.out.println("Quang and Khoa: True");
        }

        else System.out.println("Quang and Khoa: False");
        System.out.println(quangs.hashCode());
        System.out.println(khoas.hashCode());

    }
}