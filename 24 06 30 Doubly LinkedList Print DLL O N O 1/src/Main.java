import java.util.Scanner;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    public void insert (int data){
        Node newNode = new Node(data);
        if(head == null){head = newNode;}
        else{
            Node temp = head;
            while(temp.next != null){temp = temp.next;}
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        while(sc.hasNextInt()){
            int data = sc.nextInt();
            list.insert(data);
        }
        list.printList();
    }
}