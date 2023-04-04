public class ThisClassSuperClass
{
    public static void main( String args[])
    {
        B obj = new B(7);
        //B obj = new B(6);

    }
}

class A //THIS IS PARENT CLASS WHICH EXTENDS OBJECT CLASS FROM JAVA
{ 
    public A() //DEFAULT CUSTROCTUR
    {
        super();  //EVERY CONSTRUCTOR HAS SUPER() METHOD HIDDEN
        System.out.println("In A");
    }
    public A(int n)
    {
        super();  
        System.out.println("In A Int");
    }
}
class B extends A
{
    public B() //DEFAULT CUSTROCTOR
    {
        super();  
        System.out.println("In B");
    }
    // public B(int n)
    // {
    //     super(n);  //THIS WILL CALL THE PARAMETERIZED CUSTROCTOR FROM A
    //     System.out.println("In B Int");
    // }
    public B(int n)
    {
        this(); //THIS IS USED TO EXECUTE CUSTROCTOR OF SAME CLASS
        System.out.println("In B Int");
    }
}