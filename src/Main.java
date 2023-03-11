public class Main {
    public static void main(String[] args) {
        int[] list = {6, 4, 2, 3, 8, 1, 5, 9, 7};
        insertionsort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void insertionsort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;
            while (j >= 0 && temp < list[j]) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
    }

    public static void selectionsort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minPos = minimum(list, i, list.length - 1);
            swap(list, i, minPos);
        }
    }

    private static int minimum(int[] list, int b, int e) {
        int min = list[b];
        int pos = b;
        for(int i = b + 1; i <= e; i++) {
            if(list[i] < min) {
                min = list[i];
                pos = i;
            }
        }
        return pos;
    }

    private static void swap(int[] list, int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }
}
