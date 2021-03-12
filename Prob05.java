import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Prob05 {
    public static void main(String args[]) throws IOException {
        File file = new File("prob05-4-in.txt");
        Scanner scan = new Scanner(file);
        int lines = scan.nextInt();
        scan.nextLine();
        String[] dates = new String[lines];

        // Read the Dates into an array of Strings
        for (int i = 0; i < lines; i++) {
            dates[i] = scan.next();
        }

        ArrayList<String> dups = new ArrayList<String>();
        // Process the array of Strings for duplicates
        for (int i = 0; i < lines; i++) {
            for (int j = i+1; j < lines; j++) {
                if (!dups.contains(dates[i].substring(0,5)))
                    if (dates[i].substring(0,5).equals(dates[j].substring(0,5))) {
                        dups.add(dates[i].substring(0,5));
                        break;
                    }
            }
        }

        // Display results
        System.out.println(dups.size());
        System.out.print("duplicates: ");
        if (dups.isEmpty()){
            System.out.println("None");
        } else {
            for (String date: dups) 
                System.out.print(date + " ");
            System.out.println();
        }
    }
}
