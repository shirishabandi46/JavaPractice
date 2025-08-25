interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("coding in laptop");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("coding in Desktop");
    }
}
class Developer{
    public void devApp(Computer comp){
        comp.code();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer shireesha = new Developer();
        shireesha.devApp(desk);
    }
}
