/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class BSNNCuaNSoNguyenDuongDauTien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            int n = sc.nextInt();
            long ans = 1;
            for(int i = 2; i <= n; i++){
                long l = gcd(ans, i);
                long tmp = ans;
                ans = (tmp*(long)i)/l;
            }
            System.out.println(ans);
        }
    }
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
