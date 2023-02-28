import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndArrayList {
    // defining an arraylist consisting of Integer type data
    ArrayList<Integer> namesArrayList = new ArrayList<Integer>();
    void arraytoArrayList()
    {
        // creating object for UserInput class
        UserInput input = new UserInput();
        int[] numbers = input.createArrayUsingBufferedReader();
        // advanced for loop to add each entered number into the arraylist
        for (int i : numbers) namesArrayList.add(i);
        System.out.println("Converting to ArrayList: ");
        System.out.println(namesArrayList);
    }

    void arrayListtoArray()
    {
        // converting arraylist back to array
        int arraynum[] = new int[namesArrayList.size()];
        // adding numbers from arraylist to an array
        for(int i=0; i<namesArrayList.size(); i++)
        {
            arraynum[i]=namesArrayList.get(i);
        }
        System.out.println("Converting back to Array: ");
        // advanced for loop to display array
        for(int n : arraynum) System.out.print(n + " ");
        System.out.println();
    }
}
