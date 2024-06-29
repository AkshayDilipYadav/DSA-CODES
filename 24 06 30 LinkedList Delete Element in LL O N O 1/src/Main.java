import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void delete(int data){
        if(head == null){
            return;
        }
        while(head != null && head.data == data){
            head = head.next;
        }
        Node current = head;
        while(current != null&& current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }

    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
            System.out.print(" ");
        }
        System.out.println();
    }

}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = sc.nextInt();
        for(int i =0; i< n; i++){
            int data = sc.nextInt();
            list.insert(data);
        }

        int valueToDelete = sc.nextInt();
        list.printList();
        list.delete(valueToDelete);
        list.printList();
    }
}