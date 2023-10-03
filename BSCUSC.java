/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class BSCUSC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            Long a = sc.nextLong();
            Long b = sc.nextLong();
            Long tmp;
            if(a < b){
                tmp = a;
                a = b;
                b = tmp;
            }
            Long l = USC(a, b);
            System.out.println(a*b/l + " " + l);
        }
    }
    
    public static Long USC(Long a, Long b){
        if(b == 0){
            return a;
        }
        return USC(b, a%b);
    }
    
}
