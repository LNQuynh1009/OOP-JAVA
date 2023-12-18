/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HoaDon;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
/**
 *
 * @author QUYNH
 */

class MH{
    public String id, name;
    public long l1, l2;

    public MH(Scanner sc) {
        id = sc.next();
        sc.nextLine();
        name = sc.nextLine();
        l1 = sc.nextLong();
        l2 = sc.nextLong();
    }
    public MH() {
    }
    
}

class HD extends MH{
    private static int cur = 1;
    private String ma;
    private int sl;
    private long giam, tra;

    public HD(Scanner sc, MH[] a) {
        ma = sc.next() + "-" + String.format("%03d", cur++);
        for(MH i : a){
            if(ma.startsWith(i.id)){
                this.name = i.name;
                this.l1 = i.l1;
                this.l2 = i.l2;
                break;
            }
        }
        sl = sc.nextInt();
        long tien = 0;
        if(ma.charAt(2) == '1'){
            tien = this.l1*sl;
        }
        else tien = this.l2*sl;
        if(sl >= 150){
            giam = tien*50/100;
        }
        else if(sl >= 100){
            giam = tien*30/100;
        }
        else if(sl >= 50){
            giam = tien*15/100;
        }
        tra = tien - giam;
    }
    @Override
    public String toString() {
        return ma + " " + this.name + " " + this.giam + " " + this.tra;
    }
    
}

public class HoaDon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA1.in"));
        int n = sc.nextInt();
        MH[] a = new MH[n];
        for(int i = 0; i < n; i++){
            a[i] = new MH(sc);
        }
        sc = new Scanner(new File("DATA2.in"));
        int m = sc.nextInt();
        HD[] b = new HD[m];
        for(int i= 0; i < m; i++){
            b[i] = new HD(sc, a);
        }
        for(int i = 0; i < m; i++){
            System.out.println(b[i]);
        }
    }
    
}

/*
2
AT
Ao thun
80000
45000
QJ
Quan Jean
220000
125000
2
AT1 95
QJ2 105
*/