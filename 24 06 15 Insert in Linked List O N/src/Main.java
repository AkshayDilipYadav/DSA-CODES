import java.util.Scanner;
public class Main{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val =x;}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;
        for(int i =1; i<n; i++){
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }
        int b = sc.nextInt();
        int c = sc.nextInt();
        ListNode newHead = insertNode(head, b, c);
        current = newHead;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;

        }
        System.out.println();
    }
    public static ListNode insertNode(ListNode A, int b, int c){
        ListNode newNode = new ListNode(b);
        if(c == 0){
            newNode.next = A;
            return newNode;
        }
        ListNode current = A;
        int currentPosition = 0;
        while(current != null && currentPosition < c-1){
            current = current.next;
            currentPosition++;

        }
        if(current == null){
            current = A;
            while(current.next != null){}
            current.next = newNode;
        }
        else{
            newNode.next = current.next;
            current.next = newNode;
        }
        return A;
    }
}