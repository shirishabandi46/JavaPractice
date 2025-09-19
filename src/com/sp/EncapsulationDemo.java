class Human{
    private int id;
    private String name;

    public Human()
    {
        this.id = 5;
        this.name = "Abhi";
    }
    public Human(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public void setId(int a){
        id=a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}
public class EncapsulationDemo {

    public static void main(String[] args){
        Human human = new Human();
        Human human1 = new Human(7, "Pashi");
        //values from default constructor
        System.out.println(human.getName() + ":" + human.getId());
        //values from parameterized constructor
        System.out.println(human1.getName() + ":" + human1.getId());
        human.setId(3);
        human.setName("Shireesha");
        //values from setters
        System.out.println(human.getName() + ":" + human.getId());
    }

}


