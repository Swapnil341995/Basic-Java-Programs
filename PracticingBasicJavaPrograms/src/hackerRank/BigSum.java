package hackerRank;

import java.util.*;

public class BigSum
{
    public static long aVeryBigSum(long []num)
    {
        long sum = 0;
        for(long i : num)
        {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long num[] = new long[size];
        for(int i = 0;i < size;i++)
        {
            num[i] = sc.nextInt();
        }

         System.out.println(aVeryBigSum(num));
    }
}