public class SolutionMergeLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode helper;
        ListNode anotherHelper;
        ListNode firstNode = l1;
        ListNode secondNode = l2;

        while (true) {
            if (firstNode.val >= secondNode.val)  {
                if (secondNode.next == null) {
                    ListNode freshNode = new ListNode(firstNode.val);
                    secondNode.next = freshNode;
                    secondNode = secondNode.next;
                }else {
                    if   (firstNode.val <= (secondNode.next).val) {
                        helper = secondNode.next;
                        ListNode freshNode = new ListNode(firstNode.val, helper);
                        secondNode.next = freshNode;
                        secondNode = secondNode.next;
                    }
                }

            }
            if (firstNode.next == null) {
                return l2;
            }

            firstNode = firstNode.next;

        }
    }
}
