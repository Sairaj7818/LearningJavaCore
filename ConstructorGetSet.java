public class ConstructorGetSet
{
    public static void main( String args[])
    {
        Human obj = new Human();
        Human obj1 = new Human(99,"Omm");
        
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());

    }
}

class Human
{ 
    private int age;  
    private String name; 

    //CREATING CONSTRUCTOR WITH SAME CLASS NAME
    public Human()   //default constructor
    {
        age = 12;
        name = "Sairaj";
    }

    public Human(int age, String name)  //Parameterirzed constructor
    {
        this.age = age;
        this.name = name;
    }

    
    
    public String getName()  
    {
        return name;
    }
    // public void setName(String name)
    // {
    //    this.name = name;  
    // }
    
    public int getAge()
    {
        return age;
    }
    // public void setAge(int age)
    // {
    //     this.age = age; 
    // }


}