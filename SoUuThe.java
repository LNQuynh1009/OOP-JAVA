/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class SoUuThe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            String s = sc.next();
            int ok = 1;
            if(s.charAt(0) == '0') ok = 0;
            for(int i = 0; i < s.length(); i++){
                if(!Character.isDigit(s.charAt(i))){
                    ok = 0;
                }
            }
            if(ok == 0){
                System.out.println("INVALID");
            }
            else{
                if(check(s) == 1){
                    System.out.println("YES");
                }
                else System.out.println("NO");
                }
        }
    }
    public static int check(String s){
        int n = s.length();
        int le = 0;
        int chan = 0;
        for(int i = 0; i < n; i++){
            if((s.charAt(i) - '0') % 2 == 0){
                chan++;
            }
            else le++;
        }
        if(le > chan){
            if(n%2 != 0){
                return 1;
            }
            else return -1;
        }
        else{
            if(n%2 == 0){
                return 1;
            }
            else return -1;
        }
    }
    
}
