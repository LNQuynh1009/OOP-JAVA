/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class PhanTichSoNguyenTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for(int j = 1; j <= TC; j++){
            System.out.print("Test " + j + ": ");
            int n = sc.nextInt();
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n%i == 0){
                    System.out.print(i);
                    int idx = 0;
                    while(n%i == 0){
                        idx++;
                        n /= i;
                    }
                    System.out.print("(" + idx + ") ");
                }
            }
            if(n > 1) System.out.print(n + "(1)");
            System.out.println();
        }
    }
    
}
