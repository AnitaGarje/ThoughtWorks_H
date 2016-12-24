

package thoughtwapp;

import java.util.Scanner;
public class EatOrNot11 {
    
    public static void main(String args[])
    {
        Scanner userip=new Scanner(System.in);
        int[] need=new int[4];
        int n;
        need[0]=userip.nextInt();
        need[1]=userip.nextInt();
        need[2]=userip.nextInt();
        need[3]=userip.nextInt();
        n=userip.nextInt();
        int[] V=new int[n];
        int[] C=new int[n];
        int[] F=new int[n];
        int[] P=new int[n];
        for(int i=0;i<n;i++)
        {
            V[i]=userip.nextInt();
            C[i]=userip.nextInt();
            F[i]=userip.nextInt();
            P[i]=userip.nextInt();
        }
        Fruit f=new Fruit();
        
        if((f.checkDiet(V, need[0])) & (f.checkDiet(C, need[1])) & (f.checkDiet(F, need[3])) & (f.checkDiet(P, need[3])))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
    
}
class Fruit
{
    public boolean checkDiet(int[] V,int need)
    {   
        int sum=0;
        for(int num:V)
        {
            sum=sum+num;
            if(sum>=need)
            {
                return true;
            }
        }
        return false;
    }
}
