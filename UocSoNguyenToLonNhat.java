/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class UocSoNguyenToLonNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            long n = sc.nextLong();
            long ans = 0;
            for(int i = 2; i <= Math.sqrt(n); i++){
                while(n%i == 0){
                    ans = i;
                    n /= i;
                }
            }
            if(n > 1) ans = n;
            System.out.println(ans);
        }
    }
    
}
