/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class DanhDauChuCai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> se = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
            se.add(s.charAt(i));
        }
        System.out.println(se.size());
    }
    
}
