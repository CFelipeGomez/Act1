package picafija;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Picafija {

    public static void main(String[] args) {

        pica();
    }

    public static void pica() {
        Scanner sc = new Scanner(System.in);
        int[] num = {1, 2, 3, 4};
        int[] n = new int[4];
        JOptionPane.showMessageDialog(null, "PICAS - FIJAS");
        JOptionPane.showMessageDialog(null, "NO SE REPITEN NUMEROS NI CONTIENE 0");
        int picas = 0;
        int fijas = 0;
        int numa;

        JOptionPane.showMessageDialog(null, "DIGITE UN NUMERO");
        while (fijas <= 3) {
            picas=0;
            fijas=0;
            for (int i = 0; i < 4; i++) {
                numa = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el " + (i + 1) + " numero"));
                n[i] = numa;
            }
            for (int i = 0; i < 4; i++) {
                System.out.print(n[i]+" ");  
            }
            System.out.println("");
            //0,0
            if (num[0] == n[0]) {
                fijas++;
            }
            if (num[0] == n[1]) {
                picas++;
            }
            if (num[0] == n[2]) {
                picas++;
            }
            if (num[0] == n[3]) {
                picas++;
            }
            //0,1
            if (num[1] == n[1]) {
                fijas++;
            }
            if (num[1] == n[0]) {
                picas++;
            }
            if (num[1] == n[2]) {
                picas++;
            }
            if (num[1] == n[3]) {
                picas++;
            }
            //0,2
            if (num[2] == n[2]) {
                fijas++;
            }
            if (num[2] == n[0]) {
                picas++;
            }
            if (num[2] == n[1]) {
                picas++;
            }
            if (num[2] == n[3]) {
                picas++;
            }
            //0,3
            if (num[3] == n[3]) {
                fijas++;
            }
            if (num[3] == n[1]) {
                picas++;
            }
            if (num[3] == n[2]) {
                picas++;
            }
            if (num[3] == n[0]) {
                picas++;
            }
        JOptionPane.showMessageDialog(null, "Tiene : " + picas + " picas" + "\n" + "Tiene: " + fijas + " fijas");
        
        }
    }
}
