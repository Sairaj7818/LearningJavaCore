//TYYE CASTING ON OBJECTS OF DIFFERENT CLASSES
// DOWN CASTING MEANS OBJECT OF HIGHER CLASS IS MADE TO REFER SUB CLASS
// UP CASTING MEANS OBJECT OF SUB CLASS IS MADE TO REFER HIGHER CLASS 

public class TypeCastingOOPS
{
    public static void main (String args[])
    {
        A obj = (A) new B(); //up casting
        obj.show1();
    }
}

class A
{
    public void show1()
    {
        System.out.println("in A show1");
    }

}
class B extends A
{
    public void show2()
    {
        System.out.println("in B show2");
    }

}
