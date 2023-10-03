/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class KhaiBaoLopNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gt = sc.next();
        String ns = sc.next();
        sc.nextLine();
        String dc = sc.nextLine();
        String thue = sc.next();
        String date = sc.next();
        System.out.print("00001 " + name + " " + gt + " " + ns + " " + dc + " " + thue + " " + date);
        System.out.println();
    }
    
}
