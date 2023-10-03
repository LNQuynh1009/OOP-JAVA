/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class HinhSao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i = 0; i < n-1; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            a[u]++;
            a[v]++;
        }
        for(int i = 1; i <= n; i++){
            if(a[i] != 1 && a[i] != n-1){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    
}
