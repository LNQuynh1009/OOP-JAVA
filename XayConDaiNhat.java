/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XayConDaiNhat;
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */
public class XayConDaiNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "" + s.charAt(s.length()-1);
        for(int i = s.length() -2; i >= 0; i--){
            if(res.length() > 0 && s.charAt(i) >= res.charAt(0)){
                res = s.charAt(i) + res;
            }
        }
        System.out.println(res);
    }
    
}
