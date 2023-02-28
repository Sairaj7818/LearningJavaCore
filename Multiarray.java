class Multiarray
{
    public static void main(String args[])
    {
        System.out.println("Multi Dimensional Array!!!");

        int nums[][] = new int [3][4];
        

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
            }
            
        }
            //This is simple for loop to print the values
        // for(int i=0; i<3; i++)
        // {
        //     for(int j=0; j<4; j++)
        //     {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }


            //This is enhanced for loop to print the values
        for( int n[] : nums)  //pointing to array inside nums array
        {
            for( int m : n) //pointing to element from n array
            {
                System.out.print(m + " ");
            } 
            System.out.println();
        }
        
    }
}