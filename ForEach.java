class ForEach
{
    public static void main(String args[])
    {
        //FOR EACH LOOP FOR INTEGERS
        // int nums[] = new int[4];

        // nums[0] = 0;
        // nums[1] = 1;
        // nums[2] = 2;
        // nums[3] = 3;

        // for( int n : nums)//this will fetxh each value from nums array and give it to n
        // {
        //     System.out.println(n);
        // } 
        

        //FOR EACH LOOP FOR OBJECTS
        Students student[] = new Students[3]; //created array of 3 students
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        Students s1 = new Students();
        s1.rollno = 10;
        s1.name = "Sairaj";
        s1.marks = 55;

        Students s2 = new Students();
        s2.rollno = 11;
        s2.name = "Jayesh";
        s2.marks = 75;

        Students s3 = new Students();
        s3.rollno = 12;
        s3.name = "Jammy";
        s3.marks = 88;

      

        for( Students stud : student)
        {
            System.out.println(stud.rollno + " : " + stud.name + " : " + stud.marks);
        }




    }
}

class Students
{
    int rollno;
    String name;
    double marks;
}
