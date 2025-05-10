// craete an interface and implement it ...........


public class ArrayADT implements ArrayInterface {
//public class ArrayADT implements ArrayInterface{
    //array to store data
    private int[] arr;
    //size of an array (array kaha tak bhara hua hai.)
    private int size;
    //capacity of an array 
    private int maxCapacity;

    //constructor
    public ArrayADT(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.arr = new int[this.maxCapacity];
        this.size = 0;
    }

    //insert
    public void insertAnElement(int value) {
        if(size == this.maxCapacity) {
            System.out.println("array is full");
            return;
        }
        arr[size] =value;
        size++;
    }

    //traversing an array
    public void traverseAnArray() {
        System.out.println("Array elements are : ");
        for(int i=0; i< this.size; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public int getArraySize() {
        return this.size;
    }

    // get element 
    public int getElement(int getIndex) {
         if(getIndex >= this.size || getIndex <=0) {
            System.out.println("invalid index");
            //return ;
        }
        return arr[getIndex];
    }

     //serch element
     public void searchElement(int value) {
        for(int i = 0; i < size; i++){
            if(arr[i] == value) {
            System.out.println(value + " is found at index "+ size);
            break;
            }
        }
    }

    //update value by using index
    public void updateAnArrayElement(int updateIndex, int value) {
        if(updateIndex >= this.size || updateIndex <=0) {
            System.out.println("invalid index");
            return;
        }
        arr[updateIndex] = value;
    }
    
    //delete
    public void deleteElementByIndex(int deleteIndex) {
        if(deleteIndex >= this.size || deleteIndex <=0) {
            System.out.println("invalid index");
            return;
        }
        for(int i = deleteIndex; i< size - 1; i++){
            arr[i] =arr[i+1];
        }
        size--;
    }

}