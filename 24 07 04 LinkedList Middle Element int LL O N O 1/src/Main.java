import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

class Solution{
    public int findMiddleElement(ListNode head){
        if(head == null ){return -1;}
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
    public ListNode createLinkedList(){
        Scanner sc = new Scanner(System.in);
        ListNode dumy = new ListNode(0);
        ListNode curr = dumy;
        int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            int val = sc.nextInt();
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dumy.next;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode head = solution.createLinkedList();
        int middleElement = solution.findMiddleElement(head);
        System.out.println(middleElement);
    }
}