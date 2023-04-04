public class ThisClassSuperClass
{
    public static void main( String args[])
    {
        //B obj = new B();
        B obj = new B(6);

    }
}

class A //THIS IS PARENT CLASS WHICH EXTENDS OBJECT CLASS FROM JAVA
{ 
    public A() //DEFAULT CUSTROCTUR
    {  
        System.out.println("In A");
    }
    public A(int n)
    {
        System.out.println("In A Int");
    }
}
class B extends A
{
    public B() //DEFAULT CUSTROCTOR
    {
        System.out.println("In B");
    }
    public B(int n)
    {
        System.out.println("In B Int");
    }
}