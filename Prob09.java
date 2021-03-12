import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prob09 {
    public static void main(String args[]) throws IOException {
        final double MYPI = 3.1415926536;
        final double COCKPIT_USED = 2.2 + 4.1;
        final double BODY_USED = 12.1;
        final double MINION = 1.2;

        File file = new File("prob09-3-in.txt");
        Scanner scan = new Scanner(file);

        int minionCount = scan.nextInt();
        double cockPitRadius = scan.nextDouble();
        double bodyRadius = scan.nextDouble();
        double bodyHeight = scan.nextDouble();
        double podLength = scan.nextDouble();
        double podWidth = scan.nextDouble();
        double podHeight = scan.nextDouble();

        double cockPitAvailable = (double)4/3*MYPI*Math.pow(cockPitRadius,3) - COCKPIT_USED;
        System.out.printf("Cockpit %.2f %n",cockPitAvailable);

        double bodyAvailable = bodyHeight*MYPI*Math.pow(bodyRadius,2) - BODY_USED;
        System.out.printf("Body %.2f %n",bodyAvailable);

        double podAvailable = (double)1/3*podLength*podWidth*podHeight;
        podAvailable*=2;
        System.out.printf("Pods %.2f %n",podAvailable);

        double minionsNeed = MINION*minionCount;
        System.out.printf("Minions Need %.2f %n",minionsNeed);

        //  available space rounded to two decimal places
        double available = Math.round((cockPitAvailable+bodyAvailable+podAvailable)*100)/100;

        if (minionsNeed <= available) {
            System.out.println("PLAN ACCEPTED");
        } else {
            System.out.println("PLAN REJECTED");
        }
        scan.close();
    }
}
