/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class KhacNhau1DonVi {

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
            for(int i = 0; i < s.length()-1; i++){
                int so = (s.charAt(i)-'0') - (s.charAt(i+1) - '0');
                if(Math.abs(so) != 1){
                    ok = 0; 
                    break;
                }
            }
            if(ok == 0){
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
    
}
