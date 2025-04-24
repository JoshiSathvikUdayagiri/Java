
// Linear Search in Java
// This program demonstrates a simple linear search algorithm.

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 3;
        boolean found = linearSearch(arr, target);
        if(found)
            System.out.println("Element " + target + " found in the array.");
        else 
            System.out.println("Element " + target + " not found in the array.");
    }
    public static boolean linearSearch(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]== target){
                return true;
            }
        }
        return false;
    }
}
