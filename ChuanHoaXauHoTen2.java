/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class ChuanHoaXauHoTen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        sc.nextLine();
        while(TC-- > 0){
            String s = sc.nextLine().trim();
            String[] s1 = s.split("\\s+");
            String res = "";
            for(int i = 1; i < s1.length; i++){
                if(i == s1.length-1){
                    res += chuan(s1[i]) + ", ";
                }
                else{
                    res += chuan(s1[i]) + " ";
                }
            }
            res += s1[0].toUpperCase();
            System.out.println(res);
        }
    }
    public static String chuan(String s){
        if(s.length() == 1){
            return s.toUpperCase();
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
}
