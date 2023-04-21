package lesson02.inner;

class Animal implements Comparable<Animal>{
    String breed;
    String name;
    int weight;
    int speed;
    int price;

    public Animal(String breed, String name, int weight, int speed, int price) {
        this.breed = breed;
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public int compareTo(Animal o) {
        int tmp = o.weight - weight;

        if (tmp == 0) {
            int tmp1 = o.price - price;
            if (tmp1 == 0) {
                int tmp2 = o.speed - speed;
                if (tmp2 == 0) {
                    return o.name.compareTo(name);
                } else return tmp2;
            }else return tmp1;
        } else return tmp;
    }

    @Override
    public String toString() {
        return breed + " " + name + " " + weight + " " + speed + " " + price;
    }
}
