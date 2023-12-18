/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DanhSachKhachHangTrongFile;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
/**
 *
 * @author QUYNH
 */

class KH{
    private static int cur =1;
    private String id, name, gt, ns, dc;

    public KH(Scanner sc) {
        id = "KH" + String.format("%03d", cur++);
        name = Name(sc.nextLine());
        gt = sc.nextLine();
        ns = sc.nextLine();
        if(ns.charAt(2) != '/'){
            ns = "0" + ns;
        }
        if(ns.charAt(5) != '/'){
            ns = ns.substring(0, 3) + "0" + ns.substring(3);
        }
        dc = sc.nextLine();
    }
    static String Name(String s){
        String[] res = s.trim().split("\\s+");
        String ans = "";
        for(String i : res){
            ans += i.toUpperCase().charAt(0) + i.toLowerCase().substring(1) + " ";
        }
        return ans;
    }
    public boolean cmp(KH o){
        int d1 = (ns.charAt(0)-'0')*10 + (ns.charAt(1)-'0');
        int d2 = (o.ns.charAt(0)-'0')*10 + (o.ns.charAt(1)-'0');
        int m1 = (ns.charAt(3)-'0')*10 + (ns.charAt(4)-'0');
        int m2 = (o.ns.charAt(3)-'0')*10 + (o.ns.charAt(4)-'0');
        int y1 = Integer.parseInt(ns.substring(6));
        int y2 = Integer.parseInt(o.ns.substring(6));
        if(y1 != y2){
            return y2 < y1;
        }
        if(m1 != m2){
            return m2 < m1;
        }
        return d2 < d1;
    }

    @Override
    public String toString() {
        return id + " " + name + gt + " " + dc + " " + ns;
    }
}

public class DanhSachKhachHangTrongFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        KH[] a = new KH[n];
        for(int i = 0; i < n; i++){
            a[i] = new KH(sc);
        }
        for(int i = 0; i < n-1; i ++){
            for(int j = i; j < n; j++){
                if(a[i].cmp(a[j])){
                    KH tmp = a[i];
                    a[i] =a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
    
}
