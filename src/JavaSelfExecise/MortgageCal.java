/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaSelfExecise;

/**
 *
 * @author segun
 */
public class MortgageCal {
    
    double d;
    double r;
    double p;
    //double mr = r;
    
    public MortgageCal(double d, double r, double p) {
        this.d = d;
        this.r = r/1200;
        this.p = p;
    }
    
    public void Calcu() {
        int[] aryMonths = new int[24];
        
        System.out.println(r);
        
        //for (int i = 0; i < aryMonths.length; i = i + 1)
        for (int i : aryMonths) {
        
        double mi = d * r;
        //System.out.println(mi);
        d = d + mi - p;
        double rd = d;
        
        System.out.println(rd);
        
        }
    }
    
    public static void main(String args[]) {
       
        MortgageCal cal = new MortgageCal(50837, 4.49, 275);
        
        cal.Calcu();
    }
}
