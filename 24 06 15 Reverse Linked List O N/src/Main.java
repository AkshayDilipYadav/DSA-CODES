import java.util.Scanner;
public class Main {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;
        for(int i = 1; i< n; i++){
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }
        ListNode reversedHead = reverseList(head);
        current = reversedHead;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current =next;
        }
        return prev;
    }
}
