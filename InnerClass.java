public class InnerClass
{
    public static void main(String args[])
    {
        A obj = new A(); 
        obj.show(); 

        A.AA obj1 = obj.new AA(); // THIS SYNTEX IS USED WHEN CLASS IS INSTANCE
        // A.AA obj1 = new A.AA();  //THIS SYNTEX IS USED WHEN CLASS IS STATIC
        obj1.config();
    }
}

class A
{
    int n = 5;

    public void show()
    {
        System.out.println("in class A method show");
    }

    class AA
    // static class AA
    {
        public void config()
        {
            System.out.println("in class AA method config");
        }
    }
}
