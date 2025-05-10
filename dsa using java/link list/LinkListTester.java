public class LinkListTester{
    //create menu driven program of single link list after.
   /* public static void printMenu() {
        System.out.println("---------------------------");
        System.out.println("1. insert ");
        System.out.println("2. search");
        System.out.println("3. delete");
        System.out.println("Enter your choice.");
        System.out.println("---------------------------");
    }

    public static void insertSubMenu() {
        System.out.println("1. insert at head");
        System.out.println("2. insert at end");
        System.out.println("3. insert at specific position");
    }

    public static void deleteSubMenu() {
        System.out.println("1. delete at head");
        System.out.println("2. delete at end");
        System.out.println("3. delete at specific position");
    }
*/
    public static void main(String[] args) {
        LinkList l = new LinkList();
        /*l.printData();*/
        l.insertAtBeginning(101);
        l.insertAtBeginning(102);
        l.insertAtSpecificPosition(105, 1);
        l.insertAtEnd(103);
        l.insertAtEnd(104);

        //l.insertAtBeginning(152);

        System.out.println("Link list data : ");
        l.printData();

        //l.deleteFromBegining();
        //l.deleteFromLast();
        l.deleteFromSpecificPosition(3); // start from zero

        System.out.println("Link list data after deleting some element : ");
        l.printData();

/*
        // search element
        boolean res = l.searchData(107);
        if(res) {
            System.out.println("element is present ");
        }else {
            System.out.println("element is not present ");
        }
*/


    }
}