import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Leet Code Merge 2 linked list in java solution*/

public class ListNode {

    int val;
    ListNode next;
    ListNode() {

    };
    ListNode(int val) {
        this.val=val;
    }
    ListNode(int val, ListNode next){
        this.val=val;
        this.next=next;
    }

}
class Solution{

    public ListNode mergeTwoList(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            //Merge list
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list2.next;
            } else {
                current.next = list2;
                list2=list2.next;
            }

        }
        current.next = list1 != null ? list1 : list2;
        return dummy.next;
    }

}