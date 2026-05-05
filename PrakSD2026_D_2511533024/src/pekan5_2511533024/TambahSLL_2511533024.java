package pekan5_2511533024;

public class TambahSLL_2511533024 {

    public static NodeSLL_2511533024 insertAtFront(NodeSLL_2511533024 head_3024, int value3024) {
        NodeSLL_2511533024 new_Node3024 = new NodeSLL_2511533024(value3024);
        new_Node3024.next_3024 = head_3024;
        return new_Node3024;
    }

    public static NodeSLL_2511533024 insertAtEnd(NodeSLL_2511533024 head_3024, int value3024) {
        NodeSLL_2511533024 new_Node3024 = new NodeSLL_2511533024(value3024);

        if (head_3024 == null) {
            return new_Node3024;
        }

        NodeSLL_2511533024 last = head_3024;
        while (last.next_3024 != null) {
            last = last.next_3024;
        }

        last.next_3024 = new_Node3024;
        return head_3024;
    }

    static NodeSLL_2511533024 GetNode(int data_3024) {
        return new NodeSLL_2511533024(data_3024);
    }

    static NodeSLL_2511533024 insertAtPos(NodeSLL_2511533024 headNode_3024, int position_3024, int value3024) {
        if (position_3024 < 1) {
            System.out.println("invalid position");
            return headNode_3024;
        }

        if (position_3024 == 1) {
            NodeSLL_2511533024 new_node3024 = new NodeSLL_2511533024(value3024);
            new_node3024.next_3024 = headNode_3024;
            return new_node3024;
        }

        NodeSLL_2511533024 temp = headNode_3024;

        for (int i = 1; i < position_3024 - 1; i++) {
            if (temp == null) {
                System.out.println("posisi di luar jangkauan");
                return headNode_3024;
            }
            temp = temp.next_3024;
        }

        if (temp == null) {
            System.out.println("posisi di luar jangkauan");
            return headNode_3024;
        }

        NodeSLL_2511533024 new_node3024 = GetNode(value3024);
        new_node3024.next_3024 = temp.next_3024;
        temp.next_3024 = new_node3024;

        return headNode_3024;
    }

    public static void printList_3024(NodeSLL_2511533024 head_3024) {
        NodeSLL_2511533024 curr = head_3024;

        while (curr != null) {
            System.out.print(curr.data_3024);

            if (curr.next_3024 != null) {
                System.out.print("-->");
            }

            curr = curr.next_3024;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Membuat linked list: 2 -> 3 -> 5 -> 6
        NodeSLL_2511533024 head_3024 = new NodeSLL_2511533024(2);
        head_3024.next_3024 = new NodeSLL_2511533024(3);
        head_3024.next_3024.next_3024 = new NodeSLL_2511533024(5);
        head_3024.next_3024.next_3024.next_3024 = new NodeSLL_2511533024(6);

        System.out.print("senarai berantai awal: ");
        printList_3024(head_3024);

        System.out.print("tambah 1 simpul di depan: ");
        head_3024 = insertAtFront(head_3024, 1);
        printList_3024(head_3024);

        System.out.print("tambah 1 simpul di belakang: ");
        head_3024 = insertAtEnd(head_3024, 7);
        printList_3024(head_3024);

        System.out.print("tambah 1 simpul ke posisi 4: ");
        head_3024 = insertAtPos(head_3024, 4, 4);
        printList_3024(head_3024);
    }
}