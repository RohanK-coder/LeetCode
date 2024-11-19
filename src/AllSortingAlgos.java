import java.util.*;
public class AllSortingAlgos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array to be sorted : ");
        int n = sc.nextInt();
        System.out.print("\nEnter the elements of the array : ");
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //int[] resultArr = selectionSort(arr,n);
        //int[] resultArr = bubbleSort(arr,n);
        int[] resultArr = insertionSort(arr,n);
        System.out.println(Arrays.toString(resultArr));
        
    }

    //SelectionSort
    public static int[] selectionSort(int[] arr, int n) {
        int temp = 0;
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
        return arr;
    }

    //BubbleSort
    public static int[] bubbleSort(int[] arr, int n) {
        int temp=0;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        return arr;
    }

    //Insertion Sort
    public static int[] insertionSort(int[] arr, int n){
        int temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else break;
            }
        }
        return arr;
    }
    
    
}
