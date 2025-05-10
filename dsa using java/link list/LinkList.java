public class LinkList {
    public Node head = null;

    public void insertAtBeginning(int item) {
        Node newNode = new Node(item);
        if(head == null) {
            head = newNode;
            return;
        }
        //here head data pointing to new added node(new added node next ). 
        // so it change head = new node(new head)
        // and old head is next element of link list
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int item) {
        Node newNode = new Node(item);
        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public void insertAtSpecificPosition(int item, int position) {

        Node newNode = new Node(item);
        if(position< 0){
            System.out.println("invalid position.");
            return;
        }

        if(position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int index = 0;
        while(temp.next != null && index < position - 1) {
            temp = temp.next;
            index++;
        }
 
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printData() {
        if(head == null){
            System.out.println("Link list is empty.");
            return;
        }

        //why we use temp because, if we use head then our original haed change it wehn while loop is iterated.
       Node temp = head;
        
        while(temp !=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // deleting elements from link list.

    public void deleteFromBegining() {
        if(head == null) {
            System.out.println("Link list is empty.");
            return;
        }
        head = head.next;
    }

    public void deleteFromLast() {
        if(head == null) {
            System.out.println("Link list is empty.");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteFromSpecificPosition(int position){
        if(head == null) {
            System.out.println("Link list is empty.");
            return;
        }

        if(position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for(int i = 0; i  <position - 1 && temp != null; i++){
            temp = temp.next;
        }
        
        if(temp == null || temp.next == null) {
            System.out.println("Position out of bound.");
            return;
        }
        temp.next = temp.next.next;
    }

    //search data in linklist

    public boolean searchData(int data) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

}