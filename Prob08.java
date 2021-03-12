import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prob08 {
    public static void main(String args[]) throws IOException {
        File file = new File("prob08-6-in.txt");
        Scanner scan = new Scanner(file);
        
        int height = scan.nextInt();
        int punch = scan.nextInt();
        int mad = scan.nextInt();

        String view = "";  // The view from the castle
        String blocks="";  // Temporary holder for punched blocks

        if (punch == 0) {
            for (int i = 1; i <= height; i++) {
                view += "#\n";
            }
            view = view.substring(0,view.length()-1);
        } else {
            int space = mad/10;
            if (height >= punch) {
                for (int i = 1; i <= space; i++) {
                    blocks+=".";
                }
            }
            while (height >= punch){
                height--;
                blocks+="#";
            }
            view += "#";
            while (height > 1) {
                view+="\n#";
                height--;
            }
            view+=blocks;
        }
        System.out.println(view);
        scan.close();
    }
}
