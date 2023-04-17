public class Enumeration
{
    public static void main(String args[])
    {
        Status s = Status.Pending;
        System.out.println(s);
        System.out.println(s.ordinal()); //THIS WILL PRINT INDEX NUMBER OF STATUS
    }
}

enum Status
{
    Pending, Running, Success, Failed;
}