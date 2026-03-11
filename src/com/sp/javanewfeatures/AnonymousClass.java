class Demo1{
    int x;
    public void show(){
        System.out.println("in show");
    }

}
public class AnonymousClass {
    public static void main(String[] args) {
        //anonymous inner class
        Demo1 obj = new Demo1(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }

}

