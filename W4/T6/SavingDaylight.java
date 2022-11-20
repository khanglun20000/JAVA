import java.util.Scanner;

public class SavingDaylight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String inputLine = sc.nextLine();
            String[] date = inputLine.split(" ");
            String[] sunrise = date[date.length - 2].split(":");
            String[] sunset = date[date.length - 1].split(":");

            int timeRise = Integer.parseInt(sunrise[0])*60 + Integer.parseInt(sunrise[1]);
            int timeSet = Integer.parseInt(sunset[0])*60 + Integer.parseInt(sunset[1]);

            int distance = timeSet - timeRise;
            int hour = distance / 60;
            int minute = distance - hour*60;

            System.out.println(date[0] + " " + date[1] + " " + date[2] + " " + hour + " hours " + minute + " minutes");
        }

        sc.close();
    }
}
