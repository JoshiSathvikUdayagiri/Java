import java.util.Arrays;

public class MergeSortCopy {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,10,15,7,4,7,9};
        mergeSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, r, mid);
        }
    }

    private static void merge(int[] arr, int l, int r, int mid) {
        int n1= mid-l+1, n2 = r-mid,i =0,j=0,k=l;
        int[] larr = Arrays.copyOfRange(arr, l, mid + 1), rarr = Arrays.copyOfRange(arr, mid + 1, r + 1);
        while(i<n1 && j<n2){
            arr[k++]= (larr[i]<rarr[j]) ? larr[i++] : rarr[j++];
        }
        System.arraycopy(larr, i, arr, k, larr.length - i); // Copies remaining elements of larr
        System.arraycopy(rarr, j, arr, k, rarr.length - j); // Copies remaining elements of rarr
    }
}
