/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class CatDoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
           String s = sc.next();
           int check = 0;
           String ans = new String();
           for(int i = 0; i < s.length(); i++){
               if(s.charAt(i) == '0' || s.charAt(i) == '9' || s.charAt(i) == '8'){
                   ans += '0';
               }
               else if(s.charAt(i) == '1'){
                   ans += '1';
               }
               else{
                   check = 1;
                   break;
               }
           }
           if(check == 1){
               System.out.println("INVALID");
           }
           else{
               long so = Long.parseLong(ans);
               if(so == 0){
                   System.out.println("INVALID");
               }
               else{
                   System.out.println(so);
               }
           }
        }
    }
    
}
