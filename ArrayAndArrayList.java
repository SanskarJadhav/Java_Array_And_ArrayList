import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndArrayList {
    ArrayList<Integer> namesArrayList = new ArrayList<Integer>();
    void arraytoArrayList()
    {
        UserInput input = new UserInput();
        int[] numbers = input.createArrayUsingBufferedReader();
        for (int i : numbers) namesArrayList.add(i);
        System.out.println("Converting to ArrayList: ");
        System.out.println(namesArrayList);
    }

    void arrayListtoArray()
    {
        // converting arraylist back to array
        int arraynum[] = new int[namesArrayList.size()];
        for(int i=0; i<namesArrayList.size(); i++)
        {
            arraynum[i]=namesArrayList.get(i);
        }
        System.out.println("Converting back to Array: ");
        for(int n : arraynum) System.out.print(n + " ");
        System.out.println();
    }
}