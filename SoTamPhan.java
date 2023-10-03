/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class SoTamPhan {

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
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2'){
                    ok = 0;
                    break;
                }
            }
            if(ok == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
