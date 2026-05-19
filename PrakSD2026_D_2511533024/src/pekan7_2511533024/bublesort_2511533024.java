package pekan7_2511533024;

public class bublesort_2511533024 {

    public static void bublesort_2511533024(int[] arr_3024) {
        int n_3024 = arr_3024.length;

        for (int i_3024 = 0; i_3024 < n_3024; i_3024++) {
            for (int j_3024 = 0; j_3024 < n_3024 - i_3024 - 1; j_3024++) {

                if (arr_3024[j_3024] > arr_3024[j_3024 + 1]) {
                    int temp_3024 = arr_3024[j_3024];
                    arr_3024[j_3024] = arr_3024[j_3024 + 1];
                    arr_3024[j_3024 + 1] = temp_3024;

                    System.out.println("data : " + arr_3024[j_3024] + " " + arr_3024[j_3024 + 1]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr_3024[] = {23, 78, 45, 8, 32, 56, 1};
        int n_3024 = arr_3024.length;

        System.out.print("array yang belum terurut: ");
        for (int i_3024 = 0; i_3024 < n_3024; i_3024++)
            System.out.print(arr_3024[i_3024] + " ");

        System.out.println(" ");

        bublesort_2511533024(arr_3024);

        System.out.print("array yang terurut menggunakan bublesort: ");
        for (int i_3024 = 0; i_3024 < n_3024; i_3024++)
            System.out.print(arr_3024[i_3024] + " ");

        System.out.println(" ");
    }
}