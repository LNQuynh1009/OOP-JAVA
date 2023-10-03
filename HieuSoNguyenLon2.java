/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author Admin
 */
public class HieuSoNguyenLon2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger ans = a.subtract(b);
            ans = ans.abs();
            StringBuilder sb = new StringBuilder(ans.toString());
            int l = Math.max(a.toString().length(), b.toString().length());
            while(sb.length() < l){
                sb.insert(0, '0');
            }
            System.out.println(sb.toString());
        }
    }
    
}
