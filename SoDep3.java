/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class SoDep3 {

    /**
     * @param args the command line arguments
     */
    public static int[] f = new int[10];
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        f[0] = f[1] = f[4] = f[6] = f[8] = f[9] = 0;
        f[2] = f[3] = f[5] = f[7] = 1;
        while(TC-- > 0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean check(String s){
        int n = s.length();
        for(int i = 0; i <= n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        for(int i = 0; i < n; i++){
            if(f[s.charAt(i) - '0'] == 0){
                return false;
            }
        }
        return true;
    }
}
