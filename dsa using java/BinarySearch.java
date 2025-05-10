public class BinarySearch {
     public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            //find mid index
            int midIndex = low + (high - low) /2;

            if(arr[midIndex] == target) {
                return midIndex;
            }

            if(target < arr[midIndex] ) {
                high = midIndex - 1;
            }

            if( target > arr[midIndex] ) {
                low = midIndex + 1;
            }
        }
         return -1;
     }

    public static void main(String[] args) {
        //you need sorted array for binary sort.
        int[] arr = {10, 20, 25, 60, 85};
        int target = 850;
        int res = binarySearch(arr, target);
        System.out.println(target + " is found at "+ res);   
    }
}