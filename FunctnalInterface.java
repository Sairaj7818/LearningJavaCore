public class FunctnalInterface
{
    public static void main(String args[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In Annonimous show method.")
            }
        };
        obj.show();
    }
}

@FunctionalInterface
interface A
{
    void show();
}