public class Main{
    public static void main(String[] args)
    {
        StudentList student1 = new StudentList();
        StudentList student2 = new StudentList();
        StudentList student3 = new StudentList();
        student1.input();
        student2.input();
        student3.input();
        System.out.println("\nFirst Student:  " + student1.toString());
        System.out.println("\nsecond Student:  " + student2.toString());
        System.out.println("\nthird Student:  " + student3.toString());
    }
}
