/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class XauConLonNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String x = "";
        char k = 'a';
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) >= k){
                k = s.charAt(i);
                x = k+x;
            }
        }
        System.out.println(x);        
    }
    
}
