import java.util.Arrays;

class FrequencyElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 3, 3, 5, 4, 4, 3};
        top3Frequent(arr);
    }

    static void top3Frequent(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int[] elements = new int[n];
        int[] counts = new int[n];
        int idx = 0;

        for (int i = 0; i < n;) {
            int current = arr[i];
            int count = 0;
            while (i < n && arr[i] == current) {
                count++;
                i++;
            }
            elements[idx] = current;
            counts[idx] = count;
            idx++;
        }

        for (int k = 0; k < 3; k++) {
            int max = -1;
            int maxIndex = -1;
            for (int i = 0; i < idx; i++) {
                if (counts[i] > max) {
                    max = counts[i];
                    maxIndex = i;
                }
            }
            if (maxIndex != -1) {
                System.out.println( elements[maxIndex] + "->" + counts[maxIndex]);
                counts[maxIndex] = -1; 
            }
        }
    }
}
