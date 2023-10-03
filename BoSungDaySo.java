/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class BoSungDaySo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        Set<Integer> se = new HashSet<>();
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            se.add(x);
        }
        if(se.size() == x){
            System.out.println("Excellent!");
        }
        else{
            for(int i = 1; i <= x; i++){
                if(se.contains(i)){
                    continue;
                }
                else{
                    System.out.println(i);
                }
            }
        }
    }
    
}