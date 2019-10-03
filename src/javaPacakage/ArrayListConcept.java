package javaPacakage;

import java.util.ArrayList;

public class ArrayListConcept {

    public static void main(String[] args) {

        String str[] = {"java", "selenium", "ruby", "python"};

        System.out.println(str.length);
        for (int i = 0; i < str.length; i++) {
            System.out.println(i);

            ArrayList arrayList = new ArrayList();

            arrayList.add(20);
            arrayList.add(30);
            arrayList.add(11.00);
            arrayList.add("md ullah");

            System.out.println(arrayList.size());
            System.out.println(arrayList.get(2));

            for (int j = 0; j < arrayList.size(); j++) {
                System.out.println(arrayList.get(j));
            }

        }

    }
}
