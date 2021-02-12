
public class BubbleSort {

    public static void main(String[] args) {
        int[] unorderNum = new int[] { 9, 3, 1, 5, 6 };

        selectSort(unorderNum);
        // print data
        for (int num : unorderNum) {
            System.out.print(num + ",");
        }
    }

    private static void bubbleSort(int[] rawNum) {

        int i = rawNum.length;
        while (i >= 0) {
            for (int j = 0; j < i - 1; j++) {
                if (rawNum[j] > rawNum[j + 1]) {
                    swap(rawNum, j, j + 1);
                }
            }
            i--;
        }
    }

    private static void insertSort(int[] rawNum) {

        for (int i = 1; i < rawNum.length; i++) {

            int value = rawNum[i];
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (value < rawNum[j]) {
                    index = j;
                    swap(rawNum, j, j + 1);
                } else {
                    j = -1;
                }
            }
            rawNum[index] = value;
        }
    }

    private static void selectSort(int[] rawNum) {

        for (int i = 0; i < rawNum.length - 1; i++) {

            int min = i;
            for (int j = i; j < rawNum.length; j++) {
                if (rawNum[j] < rawNum[min]) {
                    min = j;
                }
            }
            swap(rawNum, i, min);
        }
    }

    private static void swap(int[] rawNum, int j, int i) {
        int m = rawNum[i];
        rawNum[i] = rawNum[j];
        rawNum[j] = m;
    }
}