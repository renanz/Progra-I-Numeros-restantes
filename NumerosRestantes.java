/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosrestantes;

/**
 *
 * @author Renan
 */
import java.util.Scanner;
public class NumerosRestantes {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        int [] num = new int [10];
        num [0] = 8;
        num [1] = 10;
        num [2] = 7;
        num [3] = 5;
        num [4] = 3;
        num [5] = 2;
        num [6] = 1;
        for (int i=0; i<10; i++) {
            for (int x=0;x<10 ;x++ ) {
                if (num[i]>num[x]) {
                    int temp = num[x];
                    num [x] = num [i];
                    num[i] = temp;
                }
            }
        }
        int mayor = num[0];
        int menor = 0;
        for (int i = 9; 0 <= i; i--) {
            if (num[i]!=0) {
                menor=num[i];
                break;
            }
        }
        for (int a = 0, f=mayor; a < 10 && f>=menor; a++, f--) {
            //System.out.println ("Array en: "+a+"\nF en: "+f);
            if (f==num[a]) {
                
            }else {
                System.out.println(f);
                a--;
            }
        }
    }
}
