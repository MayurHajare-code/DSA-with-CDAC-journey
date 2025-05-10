public class ArrayTester {
    public static void main(String[] args) {

        ArrayADT a = new ArrayADT(10);

        a.insertAnElement(101);
        a.insertAnElement(102);
        a.insertAnElement(103);
        a.traverseAnArray();
        System.out.println("length of array is : "+ a.getArraySize());

        System.out.println("element at index 2 is : "+a.getElement(2));

        a.searchElement(103);  // error is here...

        a.updateAnArrayElement(2,1003);
        a.deleteElementByIndex(1);
        a.traverseAnArray();
    }
}