public class Method
{


    public static void main(String args[])
    {
        Computer comp =  new Computer();
        comp.playMusic();
        String str = comp.getMeAPen(2);
        System.out.println(str);
        
    }
}

class Computer
{
    public void playMusic()
    {
        System.out.println("Music is playing....");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)
            return "Pen";
        else
            return "Enter amount greater than 10";
    }
}