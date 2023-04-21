package dubleg.ad;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Galka", 150, 12,40000);
        Animal dog = new Animal("Gray", 15, 35, 35000);
        Animal leopard = new Animal("Cheetos", 26, 76, 155000);

        Animal[] arr = {cat, dog, leopard};

        Arrays.sort(arr, new CompareByName());

        for (Animal tmp: arr) {
            System.out.println(tmp);
        }

        System.out.println();
        Arrays.sort(arr, new CompareByWeight());

        for (Animal tmp: arr) {
            System.out.println(tmp);
        }

        System.out.println();
        Arrays.sort(arr, new CompareBySpeed());

        for (Animal tmp: arr) {
            System.out.println(tmp);
        }
    }
}
