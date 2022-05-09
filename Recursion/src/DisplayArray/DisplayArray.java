package DisplayArray;

public class DisplayArray {
    public static void displayArr(int[] arr, int idx) {
        if (idx == arr.length) return;

        System.out.print(arr[idx] + " ");
        displayArr(arr, idx + 1);
    }
    public static void main(String[] args) throws Exception {

        int[] arr = {12, 41, 51, 94, 30};
        displayArr(arr, 0);

    }

}
