//DYNAMIC METHOD DISPATCH
//HERE WE USE SAME OBJECT TO BEHAVE DIFFERENTLY WHILE RUNNING
// WE ARE REFERING IT TO DIFFERENT CLASS TO CALL THE METHODS USING SAME OBJECT
public class DynamicMethodDispatch
{
    public static void main (String args[])
    {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
    
}

class A
{
    public void show()
    {
        System.out.println("in A Show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("in B Show");
    }
}

class C extends A
{
    public void show()
    {
        System.out.println("in C Show");
    }
}