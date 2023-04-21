package dubleg;

import java.util.Arrays;

class SimpleComparableStudent implements Comparable {
    private String firstName;
    private int group;

    SimpleComparableStudent(String firstName, int group){
        this.firstName = firstName;
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName + " " + group;
    }

    @Override
    public int compareTo(Object o) {
        if (this.group > ((SimpleComparableStudent)o).group)
            return 1;
        else if (this.group < ((SimpleComparableStudent)o).group)
            return -1;
        else return 0;
    }
}

class Main {
    public static void main(String[] args) {
        SimpleComparableStudent[] students = new SimpleComparableStudent[]{
                new SimpleComparableStudent("Ivan", 4),
                new SimpleComparableStudent("Anton", 2),
                new SimpleComparableStudent("Vit", 3),
                new SimpleComparableStudent("Serg", 2)
        };

        Arrays.sort(students);

        for (SimpleComparableStudent tmp: students) {
            System.out.println(tmp);
        }
    }
}