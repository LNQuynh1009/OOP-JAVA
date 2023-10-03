/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ChiaHet {

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
            if(a.mod(b) == BigInteger.ZERO || b.mod(a) == BigInteger.ZERO){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    
}
