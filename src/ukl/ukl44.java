/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

/**
 *
 * @author sfrsl
 */
public class ukl44 {
    public static void main(String[] args) {
        int a = 7, b = 17;
        int u = a, s = 0;
        int kolom = 4;

        // bagian bawah
        for (int i = 1; i <= kolom; i++) {
            for (int j = kolom; j >= i; j--) {
                System.out.print(u + "\t");
                u += b;
                s += u;
            }
            System.out.println("");
        }

        // bagian atas
        for (int i = 2; i <= kolom; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(u + "\t");
                u += b;
                s += u;
            }
            System.out.println("");
        }
        s=s-u;
       System.out.println("Jumlah Deret Aritmatikanya adalah "+s);

    }
}
    
