package hackerRank;

import java.util.*;

public class Triplets
{
    public static int[] compareTriplets(int a[], int b[])
    {
        int score[] = new int[2];
        for(int i = 0;i < 3;i++)
        {
            if(a[i] != b[i])
            {
                if(a[i] > b[i])
                {
                    score[0] += 1;
                }
                else
                {
                    score[1] += 1;
                }
            }
        }
        return score;
    }
    public static void main(String[] args)
    {
        int []a = new int[3];
        int b[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 3;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0;i < 3;i++)
        {
            b[i] = sc.nextInt();
        }
        
        int score[] = compareTriplets(a,b);
        System.out.print(score[0]+" "+score[1]);

    }
}