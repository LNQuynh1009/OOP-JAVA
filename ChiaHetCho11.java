/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ChiaHetCho11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            String s = sc.next();
            int chan = 0;
            int le = 0;
            for(int i = 0; i < s.length(); i++){
                if(i%2 == 0){
                    chan += (s.charAt(i)-'0');
                }
                else{
                    le += (s.charAt(i)-'0');
                }
            }
            if((chan-le) % 11 == 0){
                System.out.println("1");
            }
            else System.out.println("0");
        }
    }
    
}
