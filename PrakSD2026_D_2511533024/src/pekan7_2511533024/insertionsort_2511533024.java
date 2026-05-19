package pekan7_2511533024;

public class insertionsort_2511533024 {

    public static void inserttionsort_2511533024(int[] arr_3024) {
        int n_3024 = arr_3024.length;

        for (int i_3024 = 1; i_3024 < n_3024; i_3024++) {
            int key_3024 = arr_3024[i_3024];
            int j_3024 = i_3024 - 1;

            while (j_3024 >= 0 && arr_3024[j_3024] > key_3024) {
                arr_3024[j_3024 + 1] = arr_3024[j_3024];
                j_3024--;
            }

            arr_3024[j_3024 + 1] = key_3024;
        }
    }

    public static void main(String[] args) {
        int arr_3024[] = {23, 78, 45, 8, 32, 56, 1};
        int n_3024 = arr_3024.length;

        System.out.printf("array yang belum terurut:\n");
        for (int i_3024 = 0; i_3024 < n_3024; i_3024++)
            System.out.print(arr_3024[i_3024] + " ");

        System.out.println(" ");

        inserttionsort_2511533024(arr_3024);

        System.out.printf("array yang terurut:\n");
        for (int i_3024 = 0; i_3024 < n_3024; i_3024++)
            System.out.print(arr_3024[i_3024] + " ");

        System.out.println(" ");
    }
}