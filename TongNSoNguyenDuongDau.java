/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TongNSoNguyenDuongDau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC > 0){
            int n = sc.nextInt();
            System.out.println((long)n*(n+1)/2);
            TC--;
        }
    }
    
}
