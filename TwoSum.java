import java.util.Arrays;  // Make sure to import Arrays

public class TwoSum {
    public static int[] twosum (int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                return new int[]{i, j}; // Return the indices of the two numbers
            } else if(sum < target){
                i++; // Move the left pointer to the right
            } else {
                j--; // Move the right pointer to the left
            }
        } 
        return new int[]{-1, -1}; // Return -1, -1 if no solution is found
    }
    public static void main(String[] args) {
        int[] arr = {1,7,8,6,2,9,5,4,3};
        int target = 6;

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Print the sorted array
        // System.out.println(Arrays.toString(arr));
        int[] result = twosum(arr, target);
        if (result[0] != -1) {
            System.out.println("Indices of the two numbers that add up to " + target + ": " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to " + target);
        }


    }
}
