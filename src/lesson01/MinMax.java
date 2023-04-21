package lesson01;

class MinMax {
    public static void main(String[] args) {
        double[] arr = new double[10];
        double min = 0;
        double max = 0;
        double avg = 0;
        double avg1 = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
            avg += arr[i];
        }
        avg /= arr.length;
        System.out.println("Минимальное значени массива: " + min + "\nМаксимальное значение массива: " + max + "\nСреднее значение массива: " + avg);
    }
}
