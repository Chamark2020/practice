package lesson02.inner;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Animal cat1 = new Animal("Sphynx", "Murka", 7, 30, 60000);
        Animal cat2 = new Animal("Scotlander", "Charles", 10, 35, 89000);
        Animal cat3 = new Animal("Dvorovoy", "Shmyga", 11, 35, 100);
        Animal cat4 = new Animal("British", "Artur", 11, 12, 89000);
        Animal cat5 = new Animal("Main Coon", "Gerda", 17, 40, 98000);

        Animal[] cats = {cat1, cat2, cat3,cat4,cat5};

        Arrays.sort(cats);

        for (Animal tmp: cats) {
            System.out.println(tmp);
        }
    }
}
