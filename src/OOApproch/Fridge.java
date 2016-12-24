/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOApproch;

import java.util.Scanner;

/**
 *
 * @author Annu
 */
public class Fridge {
    private int numOfFruits;
     //Scanner sc=new Scanner(System.in);
    
    public Fridge(int numOfFruits) {
       
        this.numOfFruits = numOfFruits;
        //System.out.println("numOfFruits:"+numOfFruits);
       
    }

    public int getNumOfFruits() {
        return numOfFruits;
    }

    public void setNumOfFruits(int numOfFruits) {
        this.numOfFruits = numOfFruits;
    }
    
    public Fruit[] storeFruits(Scanner sc)
    {
        //System.out.println("Storing each fruits VCFP");
         Fruit[] ft=new Fruit[numOfFruits];
        for(int i=0;i<numOfFruits;i++)
        {
           // System.out.println("i:"+i);
            /*ft[i].setV(Integer.parseInt(sc.next()));
            ft[i].setC(Integer.parseInt(sc.next()));
            ft[i].setF(Integer.parseInt(sc.next()));
            ft[i].setP(Integer.parseInt(sc.next()));*/
           ft[i]=new Fruit(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            //System.out.println("Each Fruits VCFP V="+ft[i].getV()+"C="+ft[i].getC()+"F="+ft[i].getF()+"P="+ft[i].getP());
        }
        return ft;
    }
    
}
