/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ChuanHoaDanhSachSinhVien;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
/**
 *
 * @author QUYNH
 */

class SV{
    private static int cur = 1;
    private String id, name, lop, ns;
    private double gpa;

    public SV(Scanner sc) {
        id = "B20DCCN" + String.format("%03d", cur++);
        name = ch(sc.nextLine());
        lop = sc.next();
        ns = sc.next();
        gpa = sc.nextDouble();
        if(ns.charAt(2) != '/'){
            ns = "0" + ns;
        }
        if(ns.charAt(5) != '/'){
            ns = ns.substring(0, 3) + "0" + ns.substring(3);
        }
    }
    static String ch(String s){
        String[] res = s.trim().split("\\s+");
        String ans = "";
        for(String i : res){
            ans += i.toUpperCase().charAt(0) + i.toLowerCase().substring(1) + " ";
        }
        return ans;
    }
    @Override
    public String toString() {
        return id + " " + name + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
    
}

public class ChuanHoaDanhSachSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        SV[] a = new SV[n];
        for(int i = 0; i < n; i ++){
            sc.nextLine();
            a[i] = new SV(sc);
        }
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
    
}
