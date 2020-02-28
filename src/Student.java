public class Student {
    private StudentList[] Student;



    public Student(StudentList firstStudent)

    {

        this.Student = new StudentList[1];

        this.Student[0] = firstStudent;

    }
    public boolean insert(StudentList Student, int position)
    {

        if (this.Student.length == 0 && position == 0)
        {

            this.Student = new StudentList[1];

            this.Student[0] = Student.deepCopy();

            return true;

        }
        if(position < 0 || position > this.Student.length)

        {

            System.out.println("Try Again!");

            return false;

        }
        StudentList[] newStudentListing = new StudentList[this.Student.length + 1];



        for(int i = 0; i < this.Student.length + 1; i++)

        {

            if(i < position)

            {

                newStudentListing[i] = this.Student[i];

            }

            else if( i > position)

            {

                newStudentListing[i] = this.Student[i - 1];

            }

            else

            {

                newStudentListing[i] = Student;

            }

        }
        this.Student = newStudentListing;

        return true;


    }
    public boolean delete(String targetKey)

    {

        int i = 0;

        int length = Student.length;

        while(i < length && !(Student[i].compareTo(targetKey) == 0))

        {

            i++;

        }



        if(i == length)

            return false;



        Student[i] = Student[length - 1];

        Student[length - 1] = null;

        length = length - 1;

        return true;



    }
    public StudentList fetch(String targetKey)

    {

        StudentList newStudent;

        StudentList temp;



        int i = 0;

        int length = Student.length;

        while(i < length && !(Student[i].compareTo(targetKey) == 0))

        {

            i++;

        }



        if(i == length)

            return null;



        newStudent = Student[i].deepCopy();



        if(i != 0)

        {

            temp = Student[i - 1];

            Student[i - 1] = Student[i];

            Student[i] = temp;

        }

        return newStudent;

    }

}
