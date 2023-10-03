/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class BienSoDep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            String s = sc.next();
            if(tang(s) || bang(s) || bahai(s) || sautam(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    
    public static boolean tang(String s){
        String tmp = "";
        for(int i = 5; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                tmp += s.charAt(i);
            }
        }
        for(int i = 0; i < tmp.length()-1; i++){
            if(tmp.charAt(i) >= tmp.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    public static boolean bang(String s){
        String tmp = "";
        for(int i = 5; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                tmp += s.charAt(i);
            }
        }
        for(int i = 0; i < tmp.length()-1; i++){
            if(tmp.charAt(i) != tmp.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    public static boolean bahai(String s){
        if(s.charAt(5) != s.charAt(6) || s.charAt(5) != s.charAt(7) || s.charAt(6) != s.charAt(7)){
            return false;
        }
        if(s.charAt(9) != s.charAt(10)){
            return false;
        }
        return true;
    }
    public static boolean sautam(String s){
        for(int i = 5; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                if(s.charAt(i) != '6' && s.charAt(i) != '8'){
                    return false;
                }
            }
        }
        return true;
    }
}
