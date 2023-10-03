/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class SoXaCach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            int n = sc.nextInt();
            String s = "";
            for(int i = 1; i <= n; i++){
                s += String.valueOf(i);
            }
            sinh(s, "");
        }
    }
    public static boolean check(String s){
        for(int i = 0; i < s.length()-1; i++){
            int a = s.charAt(i)-'0';
            int b = s.charAt(i+1)-'0';
            if(Math.abs(a-b) == 1){
                return false;
            }
        }
        return true;
    }
    public static void sinh(String str, String ans){
        if(str.length() == 0 && check(ans)){
            System.out.println(ans + " ");
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String ros = str.substring(0,i) + str.substring(i+1);
            sinh(ros, ans+ch);
        }
    }
    
}
