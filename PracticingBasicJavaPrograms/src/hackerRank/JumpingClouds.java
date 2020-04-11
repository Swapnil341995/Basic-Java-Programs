package hackerRank;

import java.util.*;

public class JumpingClouds
{
    public static int jumpingOnClouds(int []c,int n)
    {
        int currentPos = 0;
        int jumps = 0;
        int lastPos = n-1;
        while(currentPos <	 lastPos)
        {
            if(currentPos + 1 == lastPos)
            {
                currentPos++;
            }
            else if(c[currentPos + 2] == 0)
            {
                currentPos += 2;
            }
            else
            	currentPos++;
            jumps++;
        }
        return jumps;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            c[i] = sc.nextInt();
        }
        System.out.println(jumpingOnClouds(c,n));
    }
}
