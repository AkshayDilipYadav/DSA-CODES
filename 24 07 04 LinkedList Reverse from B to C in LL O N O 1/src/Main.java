import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

 class solution{
    public static ListNode reverseBetween(ListNode head, int B , int C){
        if(head == null || B == C){return head;}
        ListNode dumy = new ListNode(0);
        dumy.next = head;
        ListNode prev = dumy;
        for(int i = 1; i< B; i++){prev = prev.next;}
        ListNode start = prev.next;
        ListNode then = start.next;
        for(int i =0; i< C-B; i++){
            start.next = then.next;
            then.next= prev.next;
            prev.next = then;
            then = start.next;
        }
        return dumy.next;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode dumy = new ListNode(0);
        ListNode tail = dumy;
        for(int i = 0; i< n; i++){
            tail.next = new ListNode(sc.nextInt());
            tail = tail.next;
        }
        ListNode head = dumy.next;
        int B = sc.nextInt();
        int C = sc.nextInt();

        printList(head);
        head = reverseBetween(head, B, C);
        printList(head);
    }
    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}