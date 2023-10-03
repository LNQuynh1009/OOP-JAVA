/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class DaoTu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        sc.nextLine();
        while(TC-- > 0){
            String s = sc.nextLine();
            String[] a = s.split(" ");
            for(String i : a){
                for(int j = i.length()-1; j >= 0; j--){
                    System.out.print(i.charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
