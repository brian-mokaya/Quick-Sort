public class QuickSort {

    public static  void quickSort(int[] arr, int low, int high){

        if (low<high) {

            int pivot = partion(arr, low, high);

            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
            
        }

    }

    private static int partion(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j=low; j<high; j++){

            if(arr[j]<pivot){

                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

    return i+1;

    }

    public static void main(String[] args) {
        /*
         * Identify the pivot
         * have the high and low
         * Pick a random value as the pivot mostly pick the 1st or last value
         */

        int[] arr = {5,6,3,34,67,65,56};
        int high = arr.length;

        quickSort(arr, 0, high-1);

        for(int num : arr){
            System.out.println(num + " ");
        }
        
    }
    
}
