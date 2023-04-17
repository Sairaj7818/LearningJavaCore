
public class Interface
{
    public static void main(String args[])
    {
       // A obj = new A(); //THIS WILL NOT WORK
       A obj;
       obj = new B();
       obj.show();
       obj.config();
    }
}

interface A
{
    void show();    //BY DEFAULT THE METHODS HERE ARE "public abstract"
    void config();  //BY DEFAULT THE METHODS HERE ARE "public abstract"
}

class B implements A  //HERE INSTEAD OF EXTENDS WE USE IMPLEMENTS
{
    public void show()
    {
        System.out.println("In Show");
    }
    public void config()
    {
        System.out.println("In Config");
    }
}