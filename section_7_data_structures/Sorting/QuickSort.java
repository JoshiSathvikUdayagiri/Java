public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,6,7,8,7};
        int[] farr = quickSort(arr, 0, arr.length-1);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static int[] quickSort(int[] arr, int low, int high) {
        if (low<high) {
            int pi = partation(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
        return arr;
    }

    private static int partation(int[] arr, int low, int high) {
        int i = low-1;
        int pivot = arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1,high);
        return i+1;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp= arr[a];
        arr[a] = arr[b];
        arr[b]= temp; 
    }
    
}