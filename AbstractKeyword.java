//ABSTRACT KEYWORD WHICH IS USED TO DECLARE A METHOD AND THIS METHOD CAN BE LATER DEFINED IN ANOTHER CLASS

public class AbstractKeyword
{
    public static void main(String args[])
    {
        //Car obj = new Car(); //THIS WILL NOT WORK AS WE CANNOT CREATE OBJ OF ABSTRACT CLASS
        Car obj = new WagonR();   //WE WILL HAVE TO MAKE OBJECT LIKE THIS
        obj.drive();
        obj.playMusic();
    }
}

abstract class Car  //WE NEED TO MAKE CLASS AS ABSTRACT TO HOLD ABSTRACT METHOD
{
    public abstract void drive(); //DECLARING A METHOD 

    public void playMusic()
    {
        System.out.println("playing music...");
    }
}

class WagonR extends Car
{
    public void drive() //DEFINING ABOVE DECLARED METHOD
    {
        System.out.println("driving...");
    }
}