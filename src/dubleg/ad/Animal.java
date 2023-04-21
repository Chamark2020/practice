package dubleg.ad;

import java.text.SimpleDateFormat;
import java.util.Comparator;

public class Animal {
   String name;
   int weight;
   int speed;
   int price;

    public Animal(String name, int weight, int speed, int price) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + weight + " " + speed + " " + price;
    }
}

class CompareBySpeed implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal)o1).speed - ((Animal)o2).speed;
    }
}
class CompareByPrice implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal)o1).price - ((Animal)o2).price;
    }
}
class CompareByWeight implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal)o1).weight - ((Animal)o2).weight;
    }
}
class CompareByName implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return (((Animal)o1).name).compareTo(((Animal)o2).name);
    }
}
