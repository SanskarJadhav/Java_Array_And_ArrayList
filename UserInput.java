import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class UserInput {
    Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public int[] createArrayUsingBufferedReader() {
        System.out.println("Enter the size of the list: ");
        int size = scan.nextInt();
        System.out.println("Enter the numbers: ");
        // creating an array of user-defined size
        int[] numbers = new int[size];
        // handling IOexception with try catch
        try{
            // using BufferedReader so that array can be entered in one line by user
            String str = br.readLine();
            String[] array_numbers = str.trim().split("\\s+");
            // converting entered string of values into integer data type
            for (int i = 0; i < size; i++) {
                numbers[i] = Integer.parseInt(array_numbers[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // return the array of integer values
        return numbers;
    }
}
