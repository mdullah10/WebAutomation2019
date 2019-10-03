package javaPacakage;


import java.util.Random;

public class randomNumber {
    public static void main(String[] args) {



        Random random = new Random();
        for (int i=1;i<=5.00;i++){
            int x=random.nextInt(10);

            System.out.println(x);
        }
    }

}
