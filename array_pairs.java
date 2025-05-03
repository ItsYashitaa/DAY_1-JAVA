public class array_pairs {
    public static void main(int numbers[])
    {
        for(int i=0;i<numbers.length;i++)

        {
            int curr=numbers[i];
            for(j=i+1;j<numbers.length;j++)
            {
                System.out.print( "("+curr+","+numbers[j]+")" );
            }
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10}; 
    }
}
