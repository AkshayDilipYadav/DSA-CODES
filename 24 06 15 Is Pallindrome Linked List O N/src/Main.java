import java.util.Scanner;
public class Main{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = new ListNode (sc.nextInt());
        ListNode current = head;
        for(int i =1; i<n; i++){
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }
        int result = isPallindrome(head);
        System.out.println(result);
    }
    public static int isPallindrome(ListNode head){
        if(head == null || head.next == null ){ return 1;}

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;
        ListNode secondHalfCopy = secondHalf;
        while (secondHalf != null){
            if(firstHalf.val != secondHalf.val){return 0;}
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        reverseList(secondHalfCopy);
        return 1;
    }
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}