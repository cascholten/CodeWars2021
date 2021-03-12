import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class Prob04 {
    public static void main(String args[]) throws IOException {
        File file = new File("prob04-3-in.txt");
        Scanner scan = new Scanner(file);
        int lines = scan.nextInt();
        scan.nextLine();
        char[][] input = new char[lines][80];
        char[][] output = new char[lines][80];
        for (int i = 0; i <  lines; i++) {
            String line = scan.nextLine();
            input[i] = line.toCharArray();
        }

        for (int i = 0; i <  lines; i++) {
            for(int j = 0; j < input[i].length; j++) {
                if (input[i][j] == '#') {
                    output[lines-i-1][j]='#';
                }
            }
        }

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < 80; j++)
                System.out.print(output[i][j]);
            System.out.println();
        }
    }
}
