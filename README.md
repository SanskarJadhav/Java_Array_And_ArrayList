# Java_Array_And_ArrayList
The following java program consists of five classes: Main, UserInput, EvenOrOdd, NearestNumbers, and ArrayAndArrayList.

The Main class acts as a user interface, where the user can
- see a menu displaying all operations that can be done
- select one operation to perform
- choose to run the program again

eo, nn, and aal are instances of the classes EvenOrOdd(), NearestNumbers(), and ArrayAndArrayList() respectively.

The UserInput class uses both Scanner and BufferedReader.
The method used is:
- createArrayUsingBufferedReader(): Scanner is used to take in the size of the array from the user. Then, BufferedReader is used to accept a string of numbers, which is then split at every space and converted to an array of type integer using Integer.parseInt().

EvenOrOdd class has been designed with the purpose to accept numbers from the user and move each number to one of two arrays named 'even' and 'odd' depending on  whether they are even or odd.

The methods used are:
- printArray(int[] array): displays the elements of a specified array consisting of integer data.
- splitEvenAndOddArrays(): uses UserInput to accept an array, counts the number of even and odd numbers in the array, defines two arrays named even and odd with their respective sizes, checks each number if divisible by 2 to decide whether to add to even or odd array, and finally calls the printArray method for both arrays.

NearestNumbers class has been designed with the purpose to find two neighboring numbers in an array with the smallest distance to each, and then return the index of the first number in the selected pair.

The method used is:
- findNearestNumbers(): uses UserInput to accept an array, sets initial minimum index to 0 and minimum difference as absolute difference between the first and second number, traverses across the array comparing difference of each pair of numbers with the minimum difference, updates both the minimum index and difference if the new pair has a smaller difference, and finally returns the minimum index after traversing the entire array.

ArrayAndArrayList class has been designed with the purpose to convert an array into ArrayList and vice versa.

The methods used are:
- arraytoArrayList(): uses UserInput to accept an array, adds each number from the array into an arraylist, and finally displays the arraylist.
- arrayListtoArray(): defines an array consisting of integer data type, adds each number from the created arraylist to the array, and finally displays the array.

Note that the ArrayList of Integer data type is defined outside of the methods for common usage, since arrayListtoArray() should use the same ArrayList created by the method arraytoArrayList().

.add() and .get() were used to add and retrieve elements from the ArrayList respectively.
