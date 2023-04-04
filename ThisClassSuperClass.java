public class ThisClassSuperClass
{
    public static void main( String args[])
    {
        B obj = new B();
    }
}

class A //THIS IS PARENT CLASS WHICH EXTENDS OBJECT CLASS FROM JAVA
{ 
    public A() //DEFAULT CUSTROCTUR
    {  
        System.out.println("In A");
    }
}
class B extends A
{
    public B() //DEFAULT CUSTROCTOR
    {
        System.out.println("In B");
    }
}