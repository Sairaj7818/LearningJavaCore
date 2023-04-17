
public class Interface
{
    public static void main(String args[])
    {
       // A obj = new A(); //THIS WILL NOT WORK
       A obj;
       obj = new B();
       obj.show();
       obj.config();

       System.out.println(A.age);
       System.out.println(A.area);

    }
}

interface A
{
    void show();    //BY DEFAULT THE METHODS HERE ARE "public abstract"
    void config();  //BY DEFAULT THE METHODS HERE ARE "public abstract"

    int age = 30;   //BY DEFAULT VARIABLE HERE ARE "STATIC ANF FINAL" 
                    //SINCE STATIC AND FINAL WE HAVE TO INITIALISE THEM HERE
    String area = "Goa"; 
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