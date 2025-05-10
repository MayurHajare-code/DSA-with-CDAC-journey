public class DsaArr {
    public static void main(String[] args) {
        //array declaration and initialization.
        int arr[] = {10, 20, 30, 40};

        //array declaration
        int arr2[];
        //array initialization
        int size =4;
        arr2 = new int[size];

        //accessing array.
        System.out.println(arr[0]);
        System.out.println(arr2[0]);

        //modification
        arr[0] = 100;


        //printing an array
        for(int i=0; i<arr.length; i++){
             System.out.println(arr[i]);
        }
        //for each loop
        for(int i:arr){
             System.out.println(i);
        }
    }
}