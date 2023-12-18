/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HoaDon2;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author QUYNH
 */

class KH{
    public static int cur = 1;
    public String id, name, gt, ns, dc;

    public KH(Scanner sc) {
        id = "KH" + String.format("%03d", cur++);
        name = sc.nextLine();
        gt = sc.next();
        ns = sc.next();
        sc.nextLine();
        dc = sc.nextLine();
    }
    public KH() {
    }
    
}

class MH{
    public static int cnt = 1;
    public String id, name, dv;
    public long mua, ban;

    public MH(Scanner sc) {
        id = "MH" + String.format("%03d", cnt++);
        name = sc.nextLine();
        dv = sc.next();
        mua = sc.nextLong();
        ban = sc.nextLong();
    }
    public MH() {
    }
    
}

class HD extends KH {
    private int sl;
    private static int d = 1;
    private String ma, ten, dv;
    private long mua, ban, tien;

    public HD(Scanner sc, KH[] a, MH[] b) {
        ma = "HD" + String.format("%03d", d++);
        String m = sc.next();
        String mh = sc.next();
        sl = sc.nextInt();
        for(KH i : a){
            if(i.id.equals(m)){
                this.name = i.name;
                this.dc = i.dc;
                break;
            }
        }
        for(MH i: b){
            if(i.id.equals(mh)){
                this.ten = i.name;
                this.dv = i.dv;
                this.ban = i.ban;
                this.mua = i.mua;
            }
        }
        this.tien = sl*this.ban;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.name + " " + this.dc + " " + this.ten + " " + this.dv + " " + this.mua + " " + this.ban + " " +this.sl + " " + this.tien;
    }
    
}

public class HoaDon2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        KH[] a = new KH[n];
        for(int i = 0; i < n; i++){
            a[i] = new KH(sc);
        }
        sc = new Scanner(new File("MH.in"));
        int m = sc.nextInt();
        MH[] b = new MH[m];
        for(int i = 0; i < m; i++){
            sc.nextLine();
            b[i] = new MH(sc);
        }
        sc = new Scanner(new File("HD.in"));
        int x = sc.nextInt();
        HD[] c = new HD[x];
        for(int i = 0; i < x; i++){
            c[i] = new HD(sc, a, b);
        }
        for(int i = 0; i < x; i++){
            System.out.println(c[i]);
        }
    }
    
}

/*
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4
*/