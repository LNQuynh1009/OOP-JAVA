/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class TapTuRiengCuaHaiXau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = Integer.parseInt(sc.nextLine());
        while(TC-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] a = s1.split(" ");
            HashSet<String> c = new HashSet<>();
            for(String i : a){
                if(!s2.contains(i)){
                    c.add(i);
                }
            }
            for(String i : c){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
}
