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
    public long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        else return gcd(b, a%b);
    }
    public void RutGon(){
        long l = gcd(tu, mau);
        tu /= l;
        mau /= l;
    }
    public Fraction Sum(Fraction f){
        long t = tu*f.mau + f.tu*mau;
        long m = mau*f.mau;
        Fraction frac = new Fraction(t, m);
        frac.RutGon();
        frac.tu *= frac.tu;
        frac.mau *= frac.mau;
        return frac;
    }
    public void in(){
        System.out.print(tu + "/" + mau + " ");
    }
}

public class TinhToanPhanSo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            long t = sc.nextLong();
            long m = sc.nextLong();
            Fraction a = new Fraction(t, m);
            t = sc.nextLong();
            m = sc.nextLong();
            Fraction b = new Fraction(t, m);
            Fraction c = a.Sum(b);
            t = a.tu*b.tu*c.tu;
            m = a.mau*b.mau*c.mau;
            Fraction d = new Fraction(t, m);
            d.RutGon();
            c.in();
            d.in();
            System.out.println();
        }
    }
    
}
