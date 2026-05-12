package pekan6_2511533024;

public class insertdll_2511533024 {

    static nodedll_2511533024 insertBegin_3024(nodedll_2511533024 head_3024, int data_3024) {
        nodedll_2511533024 new_node_3024 = new nodedll_2511533024(data_3024);

        new_node_3024.next = head_3024;

        if (head_3024 != null) {
            head_3024.prev = new_node_3024;
        }

        return new_node_3024;
    }

    public static nodedll_2511533024 insertEnd_3024(nodedll_2511533024 head_3024, int newdata_3024) {
        nodedll_2511533024 newnode_3024 = new nodedll_2511533024(newdata_3024);

        if (head_3024 == null) {
            return newnode_3024;
        }

        nodedll_2511533024 curr_3024 = head_3024;
        while (curr_3024.next != null) {
            curr_3024 = curr_3024.next;
        }

        curr_3024.next = newnode_3024;
        newnode_3024.prev = curr_3024;

        return head_3024;
    }

    public static nodedll_2511533024 insertAtPosition_3024(nodedll_2511533024 head_3024, int pos_3024, int new_data_3024) {

        if (pos_3024 <= 0) {
            System.out.println("Posisi tidak valid!");
            return head_3024;
        }

        nodedll_2511533024 new_node_3024 = new nodedll_2511533024(new_data_3024);

        if (pos_3024 == 1) {
            new_node_3024.next = head_3024;

            if (head_3024 != null) {
                head_3024.prev = new_node_3024;
            }

            return new_node_3024;
        }

        nodedll_2511533024 curr_3024 = head_3024;

        for (int i_3024 = 1; i_3024 < pos_3024 - 1 && curr_3024 != null; i_3024++) {
            curr_3024 = curr_3024.next;
        }

        if (curr_3024 == null) {
            System.out.println("Posisi tidak ada!");
            return head_3024;
        }

        new_node_3024.next = curr_3024.next;
        new_node_3024.prev = curr_3024;

        if (curr_3024.next != null) {
            curr_3024.next.prev = new_node_3024;
        }

        curr_3024.next = new_node_3024;

        return head_3024;
    }

    public static void printlist_3024(nodedll_2511533024 head_3024) {
        nodedll_2511533024 curr_3024 = head_3024;

        while (curr_3024 != null) {
            System.out.print(curr_3024.data);

            if (curr_3024.next != null) {
                System.out.print(" <-> ");
            }

            curr_3024 = curr_3024.next; // ini wajib biar tidak infinite loop
        }

        System.out.println();
    }

    public static void main(String[] args) {

        nodedll_2511533024 head_3024 = new nodedll_2511533024(2);

        head_3024.next = new nodedll_2511533024(3);
        head_3024.next.prev = head_3024;

        head_3024.next.next = new nodedll_2511533024(5);
        head_3024.next.next.prev = head_3024.next;

        System.out.print("DLL awal : ");
        printlist_3024(head_3024);

        head_3024 = insertBegin_3024(head_3024, 1);
        System.out.print("Setelah tambah node 1 di awal: ");
        printlist_3024(head_3024);

        System.out.print("Simpul 6 ditambah di akhir: ");
        head_3024 = insertEnd_3024(head_3024, 6);
        printlist_3024(head_3024);

        System.out.println("Tambah node 4 di posisi 4:");
        head_3024 = insertAtPosition_3024(head_3024, 4, 4);
        printlist_3024(head_3024);
    }
}