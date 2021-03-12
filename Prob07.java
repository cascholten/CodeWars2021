import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Prob07 {

    public static void main(String args[]) throws IOException {

        ArrayList<String> MATERIAL = new ArrayList<String>(Arrays.asList("CONCRETE", "WOOD", "STEEL", "RUBBER", "ICE"));
        ArrayList<String> SURFACE = new ArrayList<String>(Arrays.asList("RUBBER", "WOOD", "STEEL"));
        double[][] LOOKUP = {{0.90, 0.80, 0.70, 1.15, 0.15}, 
                             {0.62, 0.42, 0.30, 0.80, 0.05},
                             {0.57, 0.30, 0.74, 0.70, 0.03}};
        
        File file = new File("prob07-3-in.txt");
        Scanner scan = new Scanner(file);
        String surface = scan.next();
        String material = scan.next();

        double friction = LOOKUP[SURFACE.indexOf(surface)][MATERIAL.indexOf(material)];
        System.out.printf("%.2f",friction);
        System.out.print(" ");
        System.out.printf("%.1f",Math.toDegrees(Math.atan(friction)));
        System.out.println();

    }
    
}
