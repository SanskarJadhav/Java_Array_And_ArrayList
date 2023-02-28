public class EvenOrOdd {
    static int[] numbers;
    public static void printArray(int[] array){
        // trying out an advanced for loop
        for (int j : array) System.out.print(j + " ");
        System.out.println();
    }
    public static void splitEvenAndOddArrays(){
        // creating object for UserInput class
        UserInput input = new UserInput();
        int evenSize = 0;
        int oddSize = 0;
        numbers = input.createArrayUsingBufferedReader();
        // for loop to calculate number of even and number of odd values in entered array
        for (int number : numbers) {
            if (number % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        // defining even and odd arrays with calculated sizes
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];
        // even and odd array iterator
        int j = 0;
        int k = 0;
        // separating and adding each number to respective array
        for (int number : numbers) {
            if (number % 2 == 0)
                even[j++] = number;
            else
                odd[k++] = number;
        }
        // calling print array method in same class
        System.out.print("Even Array: ");
        printArray(even);
        System.out.print("Odd Array: ");
        printArray(odd);
    }
}
