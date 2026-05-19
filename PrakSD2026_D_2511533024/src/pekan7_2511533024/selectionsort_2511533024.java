package pekan7_2511533024;

public class selectionsort_2511533024 {

    public static void selectionsort_2511533024(int[] arr_3024) {
        int n_3024 = arr_3024.length;

        for (int i_3024 = 0; i_3024 < n_3024; i_3024++) {
            int minindex_3024 = i_3024;

            for (int j_3024 = i_3024 + 1; j_3024 < n_3024; j_3024++) {
                if (arr_3024[j_3024] < arr_3024[minindex_3024]) {
                    minindex_3024 = j_3024;
                }
            }

            int temp_3024 = arr_3024[i_3024];
            arr_3024[i_3024] = arr_3024[minindex_3024];
            arr_3024[minindex_3024] = temp_3024;
        }
    }

    public static void main(String[] args) {
        int arr_3024[] = {23, 78, 45, 8, 32, 56, 1};
        int n_3024 = arr_3024.length;

        System.out.printf("array yang belum terurut:\n");
        for (int i_3024 = 0; i_3024 < n_3024; i_3024++)
            System.out.print(arr_3024[i_3024] + " ");

        System.out.println(" ");

        selectionsort_2511533024(arr_3024);

        System.out.printf("array yang terurut:\n");
        for (int i_3024 = 0; i_3024 < n_3024; i_3024++)
            System.out.print(arr_3024[i_3024] + " ");

        System.out.println(" ");
    }
}