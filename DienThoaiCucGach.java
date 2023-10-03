/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class DienThoaiCucGach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        int[] a = new int[1000];
        for(char i = 'A'; i <= 'Z'; i++){
            if(i == 'A' || i == 'B' || i == 'C'){
                a[i] = 2;
            }
            else if(i == 'D' || i == 'E' || i == 'F'){
                a[i] = 3;
            }
            else if(i == 'G' || i == 'H' || i == 'I'){
                a[i] = 4;
            }
            else if(i == 'J' || i == 'K' || i == 'L'){
                a[i] = 5;
            }
            else if(i == 'M' || i == 'N' || i == 'O'){
                a[i] = 6;
            }
            else if(i == 'P' || i == 'Q' || i == 'R' || i == 'S'){
                a[i] = 7;
            }
            else if(i == 'T' || i == 'U' || i == 'V'){
                a[i] = 8;
            }
            else a[i] = 9;
        }
        for(char i = 'a'; i <= 'z'; i++){
            if(i == 'a' || i == 'b' || i == 'c'){
                a[i] = 2;
            }
            else if(i == 'd' || i == 'e' || i == 'f'){
                a[i] = 3;
            }
            else if(i == 'g' || i == 'h' || i == 'i'){
                a[i] = 4;
            }
            else if(i == 'j' || i == 'k' || i == 'l'){
                a[i] = 5;
            }
            else if(i == 'm' || i == 'n' || i == 'o'){
                a[i] = 6;
            }
            else if(i == 'p' || i == 'q' || i == 'r' || i == 's'){
                a[i] = 7;
            }
            else if(i == 't' || i == 'u' || i == 'v'){
                a[i] = 8;
            }
            else a[i] = 9;
        }
        while(TC-- > 0){
            String s = sc.next();
            int n = s.length();
            int ok = 1;
            for(int i = 0; i <= n/2; i++){
                if(a[s.charAt(i)] != a[s.charAt(n-i-1)]){
                    ok = 0;
                }
            }
            if(ok == 1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    
}
