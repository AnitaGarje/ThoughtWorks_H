/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOApproch;

/**
 *
 * @author Annu
 */
public class Fruit {

   
    private int V,C,F,P;
     public Fruit(int V, int C, int F, int P) {
        this.V = V;
        this.C = C;
        this.F = F;
        this.P = P;
        // System.out.println("Each Fruits VCFP V="+V+"C="+C+"F="+F+"P="+P);
    }

    public int getV() {
        return V;
    }

    public void setV(int V) {
        this.V = V;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public int getF() {
        return F;
    }

    public void setF(int F) {
        this.F = F;
    }

    public int getP() {
        return P;
    }

    public void setP(int P) {
        this.P = P;
    }
    
    
}
