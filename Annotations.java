public class Annotations
{
    public static void main (String args[])
    {
        B obj = new B();
        obj.showThatWeMakeMistakesInMethodName();
    }
}

//@Deprecated //THIS IS CLASS LEVEL ANNOTATION 
class A
{
    //@Override //USING THESE TYPES OF ANNOTATIONS TO TELL COMPILER TO SHOW THE ERROR
    public void showThatWeMakeMistakesInMethodName()
    {
        System.out.println("In Show A");
    }
}
class B extends A
{
    public void showThatWeMakeMistakesInMethodName()
    {
        System.out.println("In Show B");
    }
}