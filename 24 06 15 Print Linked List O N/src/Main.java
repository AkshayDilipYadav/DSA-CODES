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
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;
        for(int i =1; i< n; i++){
            current.next = new ListNode(sc.nextInt());
           current = current.next;
        }
        Main solution = new Main();
        solution.solve(head);
    }
    public void solve (ListNode A){
        ListNode current = A;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}