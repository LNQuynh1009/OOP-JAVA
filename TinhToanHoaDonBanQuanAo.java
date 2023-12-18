/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TinhToanHoaDonBanQuanAo;
import java.util.Scanner;
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
    public boolean cmp(HD o){
        return o.tra > tra;
    }
}

public class TinhToanHoaDonBanQuanAo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MH[] a = new MH[n];
        for(int i = 0; i < n; i++){
            a[i] = new MH(sc);
        }
        int m = sc.nextInt();
        HD[] b = new HD[m];
        for(int i= 0; i < m; i++){
            b[i] = new HD(sc, a);
        }
        for(int i = 0; i < m-1; i++){
            for(int j = i; j < m; j++){
                if(b[i].cmp(b[j])){
                    HD tmp = b[i];
                    b[i] = b[j];
                    b[j] = tmp;
                }
            }
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