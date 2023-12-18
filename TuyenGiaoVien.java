/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TuyenGiaoVien;
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */

class GV{
    private static int cur = 1;
    private String id, name, mh;
    private double sum;
    private String status;

    public GV(Scanner sc) {
        id = "GV" + String.format("%02d", cur++);
        name = sc.nextLine();
        String xt = sc.next();
        double th = sc.nextDouble();
        double cm = sc.nextDouble();
        double ut = 0;
        if(xt.endsWith("1")){
            ut = 2.0;
        }
        else if(xt.endsWith("2")){
            ut = 1.5;
        }
        else if(xt.endsWith("3")){
            ut = 1.0;
        }
        else ut = 0.0;
        if(xt.startsWith("A")){
            mh = "TOAN";
        }
        else if(xt.startsWith("B")){
            mh = "LY";
        }
        else mh = "HOA";
        sum = th*2 + cm + ut;
        if(sum >= 18){
            status = "TRUNG TUYEN";
        }
        else status = "LOAI";
    }
    public boolean cmp(GV o){
        return o.sum > sum;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + mh + " " + String.format("%.1f ", sum) + status;
    }
    
}

public class TuyenGiaoVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GV[] a = new GV[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new GV(sc);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[i].cmp(a[j])){
                    GV tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
    
}

/*
3
Le Van Binh
A1
7.0
3.0
Tran Van Toan
B3
4.0
7.0
Hoang Thi Tam
C2
7.0
6.0
*/