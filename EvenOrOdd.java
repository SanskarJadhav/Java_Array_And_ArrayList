public class EvenOrOdd {
    static int[] numbers;
    public static void printArray(int[] array){
        // trying out an advanced for loop
        for (int j : array) System.out.print(j + " ");
        System.out.println();
    }
    public static void splitEvenAndOddArrays(){
        UserInput input = new UserInput();
        int evenSize = 0;
        int oddSize = 0;
        numbers = input.createArrayUsingBufferedReader();
        for (int number : numbers) {
            if (number % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        // odd and even arrays with size
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];
        // odd and even array iterator
        int j = 0;
        int k = 0;
        for (int number : numbers) {
            if (number % 2 == 0)
                even[j++] = number;
            else
                odd[k++] = number;
        }
        // print array method
        System.out.print("Even Array: ");
        printArray(even);
        System.out.print("Odd Array: ");
        printArray(odd);
    }
}
