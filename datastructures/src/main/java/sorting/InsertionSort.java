package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {2,4,1,10,6,7,8,7};
		arr = insertionSortRecurtion(arr, arr[1],1,0);
		for(int e: arr) {
			System.out.println(e);
		}
	}
	public static int[] insertionSort(int[] arr) {
		for(int i =1;i<arr.length;i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	
	public static int[] insertionSortRecurtion(int[] arr,int key,int i,int j) {
		if(i>arr.length-1) {
			return arr;
		}
		else if(arr[j]>key && j>=0)
		{
			arr[j+1]=arr[j];
			return insertionSortRecurtion(arr, key, i, --j);
		}
		else {
			arr[j+1]=key;
			i++;
			return insertionSortRecurtion(arr, arr[i],i,i-1);
		}
	}
}

