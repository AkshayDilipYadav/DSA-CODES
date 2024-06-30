import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static LinkedList merge(LinkedList l1, LinkedList l2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        Node n1 = l1.head;
        Node n2 = l2.head;

        while(n1 != null && n2 != null){
            if(n1.data <= n2.data){
                tail.next = n1;
                n1 = n1.next;
            }
            else{
                tail.next = n2;
                n2 = n2.next;
            }
            tail = tail.next;
        }
        if(n1 != null){
            tail.next = n1;
        }
        else{
            tail.next = n2;
        }
        LinkedList mergedList = new LinkedList();
        mergedList.head = dummy.next;
        return mergedList;

    }
}

class MergeSortedLinkedLists{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        int n1 = sc.nextInt();
        for(int i = 0; i < n1; i++){
            int data = sc.nextInt();
            list1.insert(data);
        }
        int n2 = sc.nextInt();
        for(int i = 0; i < n1; i++){
            int data = sc.nextInt();
            list2.insert(data);
        }
        LinkedList mergedList = LinkedList.merge(list1, list2);
        mergedList.printList();
    }
}