public class Student {
    int id;
    String name;
    int marsks;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Shireesha";
        s1.marsks = 99;

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Pashi";
        s2.marsks = 97;

        Student s3 = new Student();
        s3.id = 3;
        s3.name = "Abhi";
        s3.marsks = 95;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        //normal for loop
        for(int i = 0; i<students.length; i++){
            System.out.println(students[i].id + " " + students[i].name + " " + students[i].marsks);
        }
        //enhanced for loop
        for(Student stud: students){
            System.out.println(stud.name + ":" + stud.marsks);
        }

    }
}
