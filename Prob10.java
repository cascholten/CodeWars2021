import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Prob10 {
    public static void main(String args[]) throws IOException {
        File file = new File("prob10-1-in.txt");
        Scanner scan = new Scanner(file);

        String line = scan.nextLine();
        ArrayList<String> villagers = new ArrayList<String>();

        while ( !line.equals("END") )
        {
            String code = line.substring(9,11);
            int hours = Integer.parseInt(line.substring(12,14));
            int minutes = Integer.parseInt(line.substring(15,17));
            int creamMinutes = Integer.parseInt(line.substring(18))*10;

            hours += creamMinutes/60;
            minutes += creamMinutes%60;
            if (minutes >= 60) {
                hours++;
            }
            if (hours < 17) {
                villagers.add(code);
            }
            line = scan.nextLine();
        }
        String output = "";
        if (!villagers.isEmpty()) {
            output+="Villagers (";
            for (int i = 0; i < villagers.size(); i++) {
                if (i == villagers.size()-1) {
                    output += villagers.get(i);
                } else {
                    output += villagers.get(i) + ", ";
                }
            }
            output+= ") look tasty";
        } else {
            output = "Blah, blah, blah, time to order delivery";
        }
        System.out.println(output);
        scan.close();
    }    
}
