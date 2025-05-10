public class Practice1 {
    public static int largestElement(int[] arr) {
          int large = arr[0];
            for(int j = 1; j <arr.length; j++) {
                if(large < arr[j])
                    large = arr[j];
            }
            return large;
    }

    public static int smallestElement(int[] arr) {
          int small = arr[0];
            for(int j = 1; j <arr.length; j++) {
                if(small > arr[j])
                    small = arr[j];
            }
            return small;
    }

    public static void main(String[] args) {
         int arr[] = {10, 50, 300, 40};

        // largest element in array
        System.out.println("large element is : " +largestElement(arr));

         // smallest element in array
        
        System.out.println("small element is : " +smallestElement(arr));
    }
}