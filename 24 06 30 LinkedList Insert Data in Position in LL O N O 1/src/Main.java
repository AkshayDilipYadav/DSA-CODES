import java.util.Scanner;
class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static LinkedList insert (LinkedList list, int data){
        Node newNode = new Node(data);
        newNode.next = null;
        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public static LinkedList insertAtPosition (LinkedList list, int data, int position){
        Node newNode = new Node(data);
        if(position == 0){
            newNode.next = list.head;
            list.head = newNode;
            return list;
        }
        Node current = list.head;
        Node previous = null;
        int index = 0;
        while(index < position && current != null){
            previous = current;
            current = current.next;
            index++;
        }
        if(previous != null){
            previous.next = newNode;
            newNode.next = current;
        }
        return list;

    }

    public static void printList(LinkedList list){
        Node currNode = list.head;
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            int element = sc.nextInt();
            list = insert(list,element);
        }
        int data = sc.nextInt();
        int position = sc.nextInt();
        printList(list);
        System.out.println();
        list = insertAtPosition(list, data, position);
        printList(list);
    }

}