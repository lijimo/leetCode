public class main {
    public static void main(String[] args) {
        ListNode thirdL1 = new ListNode(4);
        ListNode secondL1 = new ListNode(2, thirdL1);
        ListNode l1 = new ListNode(1, secondL1);
        String merged = "";

        ListNode thirdL2 = new ListNode(4);
        ListNode secondL2 = new ListNode(3, thirdL2);
        ListNode l2 = new ListNode(1, secondL2);

        ListNode result = SolutionMergeLists.mergeTwoLists(l1, l2);

        while (!((result.next).next == null)) {
            merged = merged + " " + result.val;
            result = result.next;
        }
        System.out.println(merged);

    }
}
