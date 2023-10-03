/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class XauDoiXung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            String s = sc.next();
            int n = s.length();
            if((n%2 == 0 && check(s) == 1) || (n%2 == 1 && check(s) <= 1)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static int check(String s){
        int n = s.length();
        int cnt = 0;
        for(int i = 0; i < n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                cnt++;
            }
        }
        return cnt;
    }
}
