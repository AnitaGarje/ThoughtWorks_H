

package thoughtwapp;

import java.util.Scanner;

public class EatOrNot1 {
    
    public static void main(String args[])
    {
       Diet dt=new Diet();
       dt.setDiet();
        
    }
    
}
class Diet
{

    public void setDiet()
    {
        Scanner userip=new Scanner(System.in);
        int[] need=new int[4];
        need[0]=userip.nextInt();
        need[1]=userip.nextInt();
        need[2]=userip.nextInt();
        need[3]=userip.nextInt();
    }
    
}
class Fruits
{
    public void getVCFPofFruit()
    {
        
    }
    public boolean checkFridgeFruits(int[] VCFP,int need)
    {
        int sum=0;
        for(int num:VCFP)
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
