package JavaConcepts;
/**
 * Created by pling on 08/12/2016.
 */
public class FindSum {
    public static void main(String[] args) {
        int i = 2, j = 3;
        int y = findSumMethod(i,j);
        String message, message1, message3, message4,message5;
        message = String.format("Sum of %d and %d is %d", i, j, y);
        System.out.println(message);

        if (y > 0)
        {
            message1 = String.format("Result is %s", "positve");
            System.out.println(message1);
        }
        else
        {
            message1 = String.format("Result is %s", "negative");
            System.out.println(message1);
        }

        int m = 100, n = 200;
        int z = findSumMethod(m,n);

        message3 = String.format("Sum of %d and %d is %d", m,n,z);
        System.out.println(message3);


        int count=100;
        int sumResult= getSumOfNumbers(count);
        message4 = String.format("Sum of %d numbers is %d", count,sumResult);
        System.out.println(message4);

        int oddCount=3;
        int OddSumResult= getSumOfOddNumbers(oddCount);
        message5 = String.format("Sum of %d Odd numbers is %d", oddCount,OddSumResult);
        System.out.println(message5);

    }

    public static int getSumOfNumbers(int count) {

        int value =0;

        for(int i=0;i<=100;i++) {

            value= value+i;

        }
        return value;
    }
    public static int getSumOfOddNumbers(int count) {

        int value =0;
        int loopCount=1;

        for(int i=1;loopCount<=count;i=i+2,loopCount++) {

            value= value+i;

        }
        return value;
    }


    public static int findSumMethod(int a, int b)
    {
        int x = a+b;
        return x;
    }


}
