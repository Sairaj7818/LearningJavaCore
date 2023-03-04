public class JavaInbuiltClass
{
    public static void main (String args[])
    {
        //HERE WE DONT USE OBJECTS BUT WE USE CLASS "CLASS" TO CALL STATIC BLOCK
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 2000;
        // //obj1.name = "iPhone";

        // Mobile obj2 = new Mobile(); 

        Class.forName("Mobile"); //THIS IS TO LOAD THE MOBILE CLASS AND CALL STATIC //HERE OUTPUT WILL BE 'IN STATIC BLOCK.'
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

    public Mobile()  //CONSTRUCTOR DEFINED 
    {   
        brand = "";
        price = 200;
        System.out.println("In the constructor.");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}