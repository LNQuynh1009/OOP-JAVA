/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class HopCuaHaiDaySo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] cnt = new int[1005];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            cnt[a[i]] = 1;
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            cnt[b[i]] = 1;
        }
        for(int i = 0; i < 1000; i++){
            if(cnt[i] == 1){
                System.out.print(i + " ");
            }
        }
    }
    
}
