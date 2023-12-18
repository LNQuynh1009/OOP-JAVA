/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */
public class LoaiBo100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            String s = sc.next();
            int n = s.length();
            while(s.length() != s.replace("100", "").length() && s != ""){
                s = s.replace("100", "");
            }
            System.out.println(n - s.length());
        }
    }
    
}
