public class NearestNumbers {
    static int[] numbers;
    public static int findNearestNumbers(){
        UserInput input = new UserInput();
        numbers = input.createArrayUsingBufferedReader();
        // we will initialise minindex as 0
        int minindex = 0;
        // we will initialise dif with the first difference
        // it is important to consider absolute difference
        int minvalue = Math.abs(numbers[1]-numbers[0]);
        // then run a for loop to check the rest of the pairs of numbers
        for (int i = 1; i < numbers.length-1; i++){
            int dif = Math.abs(numbers[i+1] - numbers[i]);
            if (dif < minvalue){
                minvalue = dif;
                minindex = i;
            }
        }
        return minindex;
    }
}

