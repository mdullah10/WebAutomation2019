package javaPacakage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListConcept {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("java");
        arrayList.add("Selenium");
        arrayList.add("python");
        arrayList.add("java");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.add("Ruby");
        System.out.println(arrayList.size());
        arrayList.remove(2);
        System.out.println(arrayList.size());

        // how to find duplicate elements
        Set<String> hashSet = new HashSet<>();
        for (String y : arrayList) {
            if (hashSet.add(y) == false) {
                System.out.println("duplicate element :" + y);

                hashSet.addAll(arrayList);
                arrayList.clear();
                arrayList.addAll(hashSet);
                System.out.println(arrayList);
            }
        }
    }
}
