public class StaticMethod
{
    public static void main (String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 2000;
        obj1.name = "iPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 3000;
        obj2.name = "Galaxy";

        Mobile.name = "Smartphone";

        obj1.show(); //WE NEED OBJECT TO CALL A INSTANCE METHOD
        obj2.show();

        Mobile.show1(); //THIS WILL WORK AS WE ARE CALLING STATIC METHOD USING CLASS NAME

        //Mobile.show(); //THIS WILL NOT WORK AS WE CANNOT CALL INSTANCE METHOD USING CLASS NAME
    }

}


class Mobile
{
    String brand;
    int price;
    //String name; //normal variable
    static String name; //static variable

    static  //STATIC METHOD DEFINED
    {
        name = "Phone";
        System.out.println("In static block.");
    }

    public void show() //INSTANCE METHOD
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1() //STATIC METHOD
    {
        System.out.println("In the Static Method.");
    }
     
    
}