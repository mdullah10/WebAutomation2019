package javaPacakage;

import java.util.ArrayList;

public class ExceptionHandiling {
    public static void main(String[] args) {
        //3254849


        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("java");
        arrayList.add("selenium");
        arrayList.add("python");
        try {

            for (int i = 0; i <= arrayList.size(); i++) {
                System.out.println(arrayList.get(i));

            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Show message :" + e.getMessage());

        }

        System.out.println("hash code no is:" + arrayList.hashCode());
    }
}
