package javaPacakage;

public class MyClass {

    int x, z;


    public MyClass(){
         x=10;


    }
    public MyClass(int y){
        z=y;

    }

    public static void main(String[] args) {

        MyClass obj = new MyClass();
        MyClass obj1= new MyClass(6);
        System.out.println(obj.x);
        System.out.println(obj1.z);
    }
}
