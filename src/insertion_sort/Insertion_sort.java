package insertion_sort;

public class Insertion_sort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static void insertionSort(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            int startValue = arr[i];
            int index = i-1; 
            while (index>=0&&startValue<arr[index] ) {                
                arr[index+1] = arr[index];
                index--; // -1
            }
            arr[index+1] = startValue; // -1 +1 
            
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {100, 20, 300, 40, 200};
        printArray(arr);
        insertionSort(arr, arr.length);
        System.out.println("Array after sorting:");
        printArray(arr);
    }
    
}
