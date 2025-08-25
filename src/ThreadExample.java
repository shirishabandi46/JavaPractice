class A1 extends Thread {
    public void run(){
        for (int i = 1;i<=100; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread {
    public void run(){
        for (int i = 1;i<=100; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        A1 obj1 = new A1();
        B obj2 = new B();

        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
        System.out.println(obj1.threadId());
        System.out.println(obj1.getName());
        System.out.println(obj1.isAlive());

    }
}
