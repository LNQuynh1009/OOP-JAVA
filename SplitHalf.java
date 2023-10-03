/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class SplitHalf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            String s = sc.next();
            String ans = new String();
            int check = 1;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9'){
                    ans += '0';
                }
                else if(s.charAt(i) == '1'){
                    ans += '1';
                }
                else{
                    check = 0;
                    break;
                }
            }
            if(check == 0){
                System.out.println("INVALID");
            }
            else{
                long n = Long.parseLong(ans);
                if(n == 0){
                    System.out.println("INVALID");
                }
                else{
                    System.out.println(n);
                }
            }
        }
    }
    
}
