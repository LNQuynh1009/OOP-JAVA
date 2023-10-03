/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class SoDep2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    public static boolean check(String s){
        if(s.charAt(0) != '8' || s.charAt(s.length()-1) != '8'){
            return false;
        }
        int n = s.length();
        for(int i = 0; i <= n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += (long)(s.charAt(i) - '0');
        }
        if(sum % 10 != 0){
            return false;
        }
        return true;
    }
}
