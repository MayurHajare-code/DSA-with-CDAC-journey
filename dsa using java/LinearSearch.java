public class LinearSearch {
    public static int linearSearch(int[] arr,int target) {
          int result = -1;
          for(int i = 0; i < arr.length; i++) {
            if(arr[i] ==target) {
                result = i;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = { 45, 50, 12, 88, 44};
        int target = 12;
        int res = linearSearch(arr, target);
        System.out.println(target + " is found at "+ res);    
    }
}

//best case : o(1)
//worst case : o(n)