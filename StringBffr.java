class StringBffr
{

    public static void main (String args[])
    {
        StringBuffer sb = new StringBuffer("Sairaj ");
        System.out.println(sb.capacity()); // to know the capacity of the string which is 16 but here it will show 23 as it adds the name sairaj 
        sb.append("Java"); //to append sairaj and java
        System.out.println(sb); 

        //System.out.println(sb.lenght());  // to know lenght of the string

        String str = sb.toString(); //convert StringBuffer into String

        sb.deleteCharAt(2);
        System.out.println(sb);


    }
}