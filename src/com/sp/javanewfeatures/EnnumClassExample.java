enum Status{
    Failed,Success,Running,Pending;
}

public class EnnumClassExample {
    public static void main(String[] args) {
        Status s = Status.Failed;
        switch(s) {
            case Running:
                System.out.println("All Good");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            case Success:
                System.out.println("Done");
                break;
            default:
                System.out.println("Try again");

        }

//        Status s = Status.Success;
//        System.out.println(s);
//        Status[] ss = Status.values();
//        System.out.println(ss);
//        for(Status st : ss){
//            System.out.println(st + ":" + st.ordinal());



    }
}
