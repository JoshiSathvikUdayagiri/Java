public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,10,15,7,4,7,9};
        mergeSort(arr,0,arr.length-1);
        for(int e: arr){
            System.out.println(e);
        }
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
        int n1= mid-l+1, n2 = r-mid;
        int[] larr = new int[n1];
        int[] rarr = new int[n2];
        for(int i=0;i<n1;i++){
            larr[i]= arr[i+l];
        }
        for(int i =0;i<n2;i++){
            rarr[i]= arr[i+mid+1];
        }
        int i =0,j=0,k=l;
        while(i<n1 && j<n2){
            if(larr[i]<rarr[j]){
                arr[k]=larr[i];
                i++;
            }
            else{
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }
}
