/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class PhanTichThuaSoNguyenTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        int t = TC;
        while(TC-- > 0){
            System.out.printf("Test %d: ", t-TC);
            int n = sc.nextInt();
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    int idx = 0;
                    System.out.printf("%d", i);
                    while(n % i == 0){
                        idx++;
                        n = n/i;
                    }
                    System.out.printf("(%d) ", idx);
                }
            }
            if(n > 1){
                System.out.printf("%d(1) ", n);
            }
            System.out.println();
        }
    }
    
}
