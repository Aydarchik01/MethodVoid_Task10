public class Main {
    public static void main(String[] args) {
        int[] array = {1, 8, 3, 3, 4, 4, 9, 12};
        System.out.println("Минимальное: " + min(array) + "\n" + "Максимальное: " + max(array));
    }

    public static int min(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "+"\n");
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    max = array[j];
                    array[j] = array[i];
                    array[i] = max;

                }

            }
        }
        return max;
    }
}