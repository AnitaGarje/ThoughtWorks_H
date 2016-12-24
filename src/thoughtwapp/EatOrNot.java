

package thoughtwapp;

import java.util.Scanner;

public class EatOrNot {
    
    public static void main(String args[])
    {
        Scanner userip=new Scanner(System.in);
        int[] need=new int[4];
        int n;
        long sumV=0,sumC=0,sumF=0,SumP=0;
        need[0]=userip.nextInt();
        need[1]=userip.nextInt();
        need[2]=userip.nextInt();
        need[3]=userip.nextInt();
        n=userip.nextInt();
        for(int i=0;i<n;i++)
        {
            sumV=sumV+userip.nextInt();
            sumC=sumC+userip.nextInt();
            sumF=sumF+userip.nextInt();
            SumP=SumP+userip.nextInt();
        }
        if(sumV>=need[0] & sumC>=need[1] & sumF>=need[3] & SumP>=need[2])
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
    
}
