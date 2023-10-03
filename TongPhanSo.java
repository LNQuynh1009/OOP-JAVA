/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */

class Fraction{
    public long tu;
    public long mau;

    public Fraction(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public Fraction tong(Fraction a){
        long t = (tu*a.mau) + (a.tu*mau);
        long m = mau*a.mau;
        long l = gcd(t, m);
        t /= l;
        m /= l;
        Fraction ans = new Fraction(t, m);
        return ans;
    }
    public static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    public void in(){
        System.out.println(tu + "/" + mau);
    }
}

public class TongPhanSo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long tu1 = sc.nextLong();
        long mau1 = sc.nextLong();
        Fraction f1 = new Fraction(tu1, mau1);
        tu1 = sc.nextLong();
        mau1 = sc.nextLong();
        Fraction f2 = new Fraction(tu1, mau1);
        Fraction ans = f1.tong(f2);
        ans.in();
    }
    
}
