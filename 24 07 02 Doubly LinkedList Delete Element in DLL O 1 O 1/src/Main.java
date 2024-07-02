import java.util.Scanner;

class DoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;
        Node(int d){
            data = d;
            prev = null;
            next = null;
        }
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public void deleteNode(Node del){
        if(head == null || del == null){return;}
        if(head == del){head = del.next;}
        if(del.next != null){del.next.prev = del.prev;}
        if(del.prev != null){del.prev.next = del.next;}
        return;
    }

    public void printList(){
        Node node = head;
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public Node findNode(int key){
        Node node = head;
        while(node != null){
            if(node.data == key){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            int data = sc.nextInt();
            dll.insertAtEnd(data);
        }
        int key = sc.nextInt();
        Node nodeToDelete = dll.findNode(key);
        dll.deleteNode(nodeToDelete);
        dll.printList();
    }

}