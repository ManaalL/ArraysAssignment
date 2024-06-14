import java.util.Scanner; // Import the Scanner class for user input
import java.util.Arrays; // Import the Arrays class for array operations

/**
 * Array Assignment
 * 
 * @Manaal Lakhani
 * @June 13, 2024
 */
public class ArrayAssignment {
    public static void main(String[] args) {
        // Calling each method (used online example to try, please give feedback if this way is the correct way to call all the methods)
        int[] array = declareAndPopulateArray(); 
            // Declare and populate an array with user input
        printArrayAscending(array); 
            // Print the array in ascending order
        printArrayDescending(array); 
            // PriSnt the array in descending order
        printArraySum(array); 
            // Print the sum of the array
        int[] testArray = {4, 8, 6, 1, 2, 9, 4}; 
            // Example array for testing smallest distance
        
        System.out.println("Index of first number with smallest distance: " + findSmallestDistance(testArray)); 
            // Print index of first number with smallest distance
        
        char[] charArray = {'C', 'S', '2', '2', '3'}; 
            // Example char array for testing reverse print
        printCharArrayInReverse(charArray); 
            // Print the char array in reverse order
        countCharacterOccurrences("HeLlo WorlD"); 
            // Count character occurrences in a string
        mergeAndSortArrays(); 
            // Merge two arrays and sort the result
    }

    /**
     * Declares an integer array of size 10 and populates it with user input
     * and then returns the populated array
     */
    public static int[] declareAndPopulateArray() {
        Scanner scanner = new Scanner(System.in); 
            // Creates new Scanner object for user input
        int[] array = new int[10]; 
            // Declare array of size 10
        System.out.println("Enter 10 numbers for the array:"); 
            // Prompts user to enter 10 numbers
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt(); 
                    // Populates the array with user input
        }
        return array; 
            // Returns the populated array
    }
    /**
     * Prints the array in index ascending order
     */
    public static void printArrayAscending(int[] array) {
        System.out.println("Array in ascending order:"); 
            // Print message indicating ascending order
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); 
                // Print each element in ascending order
        }
        System.out.println(); 
            // Print a newline at the end
    }

    /**
     * Prints the array in index descending order
     */
    public static void printArrayDescending(int[] array) {
        System.out.println("Array in descending order:"); 
            // Print message indicating descending order
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " "); 
                // Print each element in descending order
        }
        System.out.println(); 
            // Print a nsewline at the end
    }
    /**
     * Finds the sum of the array and prints it out
     */
    public static void printArraySum(int[] array) {
        int sum = 0; 
            // Initialize sum to 0
        for (int num : array) {
            sum += num; 
                // Add each element to the sum
        }
        System.out.println("Sum of the array: " + sum); 
            // Print the sum of the array
    }
    /**
     * Finds two neighboring numbers in an array with the smallest distance to each other
     * and returns the index of the first number
     */
    public static int findSmallestDistance(int[] array) {
        int minDistance = Integer.MAX_VALUE; 
            // Initialize minDistance to the largest integer value
        int minIndex = -1; 
            // Initialize minIndex to -1
        for (int i = 0; i < array.length - 1; i++) {
            int distance = Math.abs(array[i] - array[i + 1]); 
                // Calculate distance between neighboring elements
            if (distance < minDistance) {
                minDistance = distance; 
                    // Update minDistance if a smaller distance is found
                minIndex = i; 
                    // Update minIndex to the index of the first number
            }
        }
        return minIndex;   
            // Return the index of the first number with the smallest distance
    }

    /**
     * Prints the letters in a char array in reverse order
     */
    public static void printCharArrayInReverse(char[] array) {
        System.out.println("Char array in reverse order:"); 
            // Print message indicating reverse order
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]); 
                // Print each character in reverse order
        }
        System.out.println(); 
            // Print a newline at the end
    }
    /**
     * Counts the number of occurrences of each case-insensitive letter in the input string
     */
    public static void countCharacterOccurrences(String input) {
        int[] letterCounts = new int[26]; 
            // Create an array to store counts for each letter
        input = input.toLowerCase(); 
            // Convert the input to lowercase to ignore case

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letterCounts[c - 'a']++; 
                    // Increment the count for this letter
            }
        }

        System.out.println("Charactesr occurrences:"); 
            // Print message indicating character occurrences
        for (int i = 0; i < 26; i++) {
            if (letterCounts[i] > 0) {
                System.out.println((char) ('a' + i) + ": " + letterCounts[i]); // Print each letter and its count
            }
        }
    }

    /**
     * Merges two arrays and sorts the resulting array in ascending order
     */
    public static void mergeAndSortArrays() {
        Scanner scanner = new Scanner(System.in); 
            // Creates new Scanner object for user input
        System.out.println("Enter size of first array:"); 
            // Prompt user to enter size of first array
        int m = scanner.nextInt(); 
            // Read size of first array
        System.out.println("Enter size of second array:"); 
            // Prompt user to enter size of second array
        int n = scanner.nextInt();
            // Read size of second array

        int[] arrayA = new int[m]; 
        // Declare first array
        int[] arrayB = new int[n]; 
            // Declare second array
        int[] arrayC = new int[m + n]; 
            // Declare merged array

        System.out.println("Enter elements of first array:"); 
            // Prompt user to enter elements of first array
        for (int i = 0; i < m; i++) {
            arrayA[i] = scanner.nextInt(); 
                // Populate first array with user input
        }

        System.out.println("Enter elements of second array:"); 
            // Prompt user to enter elements of second array
        for (int i = 0; i < n; i++) {
            arrayB[i] = scanner.nextInt(); 
                // Populate second array with user input
        }

        for (int i = 0; i < m; i++) {
            arrayC[i] = arrayA[i]; 
                // Copy elements of first array to merged array
        }
        for (int i = 0; i < n; i++) {
            arrayC[m + i] = arrayB[i]; 
                // Copy elements of second array to merged array
        }

        Arrays.sort(arrayC); 
            // Sort merged array in ascending order

        System.out.println("Merged and sorted array:"); 
            // Print message indicating merged and sorted array
        for (int num : arrayC) {
            System.out.print(num + " "); 
                // Print each element of merged array
        }
        System.out.println(); 
            // Print a newline at the end
    }
}