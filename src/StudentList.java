import javax.swing.JOptionPane;
public class StudentList {
    private String Name;

    private String studentId;

    private String studentGPA;
    public StudentList()
    {
        Name = "";

        studentId = "";

        studentGPA = "";

    }

    public StudentList(String name, String studentId, String studentGPA)

    {

        this.Name = name;

        this.studentId = studentId;

        this.studentGPA = studentGPA;

    }



    public String getName(){

        return this.Name;

    }


    public String toString()

    {

        return("\nThe Student's name is: " + Name +

                "\nStudent's ID Number: " + studentId +

                "\nStudent's GPA: " + studentGPA);

    }



    public StudentList deepCopy()

    {

        StudentList clone = new StudentList(Name, studentId, studentGPA);

        return clone;

    }



    public int compareTo(String targetKey)

    {

        return(this.Name.compareTo(targetKey));

    }

    public void input()

    {

        Name = JOptionPane.showInputDialog("Enter the Student's Name");

        studentId = JOptionPane.showInputDialog("Enter the Student's ID");

        studentGPA = JOptionPane.showInputDialog("Enter the Student's GPA");

    }


}