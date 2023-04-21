package dubleg;

import java.util.ArrayList;
import java.util.Collection;

class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        Collection<Integer> list1 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.add(1));
        System.out.println(list.size());

        /*list1.addAll(list);
        System.out.println(list1 + " " + list1.size());
        list1.clear();
        System.out.println(list1 + " " + list1.size());
        System.out.println(list1.isEmpty());*/

        Object[] arr = list1.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
