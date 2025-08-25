@FunctionalInterface
interface A{
    void show();
}
//implementing interface using class
//class B implements A{
//    public void show(){
//        System.out.println("in B Show");
//    }
//}
//what if method has return type
@FunctionalInterface
interface I1{
    int add(int a, int b);
}

public class FunInterfaceLamdaEx{
    public static void main(String[] args) {

        //implementing interface using class
//        A obj1 = new B();
//        obj1.show();

        // creating object using anonymous inner class
//        A obj2 = new A(){
//            public void show(){
//                System.out.println("in Anonymous inner class show");
//            }
//        };
//        obj2.show();

        //Lambda Expression calling show method from A
        A obj3 = () -> System.out.println("using lambda expression");

        obj3.show();

        //if method has return type using lambda expression calling add method from I1
        I1 obj4 = (a,b) -> a+b;

        int result = obj4.add(4,5);
        System.out.println(result);

    }
}


