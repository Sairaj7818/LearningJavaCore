//THE CLASS WHICH DOES NOT HAVE NAME IS CALLED ANONYMOUS CLASS
//HERE THE METHOS FROM ANONYMOUS CLASS WILL BE SHOWN AND NOT FROM CLASS A
public class AnonymousClass
{
    public static void main(String args[])
    {
        A obj = new A()
        {  
            public void show()       //THIS IS SYNTEX FOR ANONYMOUS CLASS
            {
                System.out.println("in anonymous class");
            }
        };
        obj.show();
    }
}

class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}