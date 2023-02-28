import java.io.IOException;
import java.util.Scanner;
import java.io.*;
public class UserInput {
    Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public int[] createArray() {
        System.out.println("Enter the size of the list: ");
        int size = scan.nextInt();
        System.out.println("Enter the numbers: ");
        int[] numbers = new int[size];
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        return numbers;
    }
    public int[] createArrayUsingBufferedReader() {
        System.out.println("Enter the size of the list: ");
        int size = scan.nextInt();
        System.out.println("Enter the numbers: ");
        int[] numbers = new int[size];
        // handling IOexception with try catch
        try{
            String str = br.readLine();
            String[] array_numbers = str.trim().split("\\s+");
            for (int i = 0; i < size; i++) {
                numbers[i] = Integer.parseInt(array_numbers[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }
}
