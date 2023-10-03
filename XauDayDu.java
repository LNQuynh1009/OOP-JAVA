/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.HashSet;
/**
 *
 * @author Admin
 */
public class XauDayDu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            String s = sc.next();
            int k = sc.nextInt();
            HashSet<Character> se = new HashSet<>();
            for(int i = 0; i < s.length(); i++){
                se.add(s.charAt(i));
            }
            if(26-se.size() <= k){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    
}
