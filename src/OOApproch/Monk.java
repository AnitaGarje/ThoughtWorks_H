/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOApproch;

import java.util.Scanner;


public class Monk {
    
    Scanner sc=new Scanner(System.in);
    
    Diet dt=new Diet(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
    
    Fridge fg=new Fridge(sc.nextInt());
    Fruit[] ft=fg.storeFruits(sc);
    public void checkVCFP()
    {   long sV=0,sC = 0,sF = 0,sP = 0;
        for(Fruit f:ft)
        {
           sV=sV+f.getV();
           sC=sC+f.getC();
           sF=sF+f.getF();
           sP=sP+f.getP();
           
        }
        if((sV>=dt.getV()) & (sC>=dt.getC()) & (sF>=dt.getF()) & (sP>=dt.getP()))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("No");
        }
       
    }
    public  static void main(String args[])
    {
        Monk m=new Monk();
        m.checkVCFP();
        
    }
    
    
}
