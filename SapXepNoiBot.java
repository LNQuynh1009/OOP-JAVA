/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class SapXepNoiBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i = 0; i < n-1; i++){
            int ok = 0;
            for(int j =0; j < n-i-1; j++){
                if(a[j] > a[j+1]){
                    ok = 1;
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            if(ok == 1){
                cnt++;
                System.out.print("Buoc " + cnt + ": ");
                for(int j = 0; j < n; j++){
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }
        }
    }
    
}
