import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Prob03 {
    public static void main(String args[]) throws IOException {
        File file = new File("prob03-3-in.txt");
        Scanner scan = new Scanner(file);
        int rows = 0;
        int cols = 0;
        String line;
        while (scan.hasNext()) {
            line = scan.nextLine();
            cols = line.length();
            rows++;
        }

        char[][] map = new char[rows][cols];
        scan = new Scanner(file);
        rows = 0; 
        while (scan.hasNext()) {
            line = scan.nextLine();
            for (int x=0; x < line.length(); x++) {
                map[rows][x] = line.charAt(x);
            }
            rows++;
        }

        int foundX = -1;
        int foundY = -1;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 'P') {
                    foundX = j;
                    foundY = i;
                }
            }
        }

        if (foundX != -1) {
            System.out.println("Ace, move fast, pigeon is at (" + foundX + "," + foundY +")");

        } else {
            System.out.println("No pigeon, try another map, Ace");

        }

    }
}