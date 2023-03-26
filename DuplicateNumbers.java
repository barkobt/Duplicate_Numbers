import java.util.Arrays;

public class DuplicateNumbers {

    static boolean isEven(int[] arr, int value) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (value % 2 == 0) return true;

        }

        return false;
    }

    static boolean isRepeat(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 55, 6, 23, 77, 23, 2, 55, 3, 6, 6};
        int[] duplicate = new int[arr.length];
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((j != i) && (arr[i] == arr[j])) {
                    if (!isEven(duplicate,arr[i])) {
                        arr[i] = 0;
                    }
                    if (!isRepeat(duplicate, arr[i])) {
                        duplicate[startIndex++] = arr[i];
                        break;
                    }


                }
            }
        }
        for (int value : duplicate) {
            if(value != 0) {
                System.out.println(value);
            }
        }
    }
}

