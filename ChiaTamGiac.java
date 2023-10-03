/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class ChiaTamGiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            for(int i = 1; i < n; i++){
                System.out.printf("%.6f ", Math.sqrt(i/(n*1.0))*h);
            }
            TC = TC-1;
            System.out.println();
        }
    }
    
}
