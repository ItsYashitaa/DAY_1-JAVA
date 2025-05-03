public class array_largest {

    public static int getLargest(int numbers[])
    {
        int largest = numbers[0] ;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>largest)
            {
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};

        System.out.println("largest value is : " + getLargest(numbers));

    }
}
