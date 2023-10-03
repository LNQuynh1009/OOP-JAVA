/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class KhaiBaoLopSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.next();
        String ns = sc.next();
        float diem = sc.nextFloat();
        if(ns.charAt(2) != '/'){
            ns = "0" + ns;
        }
        if(ns.charAt(5) != '/'){
            String res = ns.substring(0, 3) + "0" + ns.substring(3);
            ns = res;
        }
        System.out.print("B20DCCN001 " + name + " " + lop + " " + ns + " ");
        System.out.printf("%.02f\n", diem);
    }
    
}
