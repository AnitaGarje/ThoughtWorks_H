/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thoughtwapp;

import java.util.Scanner;

public class NonDArray {
    public static void main(String args[])
    {
        Scanner userip=new Scanner(System.in);
        int num,current=0,prev=0,len=0,cnt=0;
        //System.out.println("Enter the number of elements in array:");
        num=userip.nextInt();
        for(int i=0;i<num;i++)
        {
            current=userip.nextInt();
            if(prev<=current)
            {
                cnt++;
                 if(len<cnt)
                        len=cnt;
            }
           else
            {
                cnt=1;
            }
            prev=current;
        }
        System.out.println(len);
        
    }
    
}
