/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class DemSoLanXuatHien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for(int i = 1; i <= TC; i++){
            System.out.println("Test " + i + ":");
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] cnt =  new int[10001];
            for(int j = 0; j < n; j++){
                a[j] = sc.nextInt();
                cnt[a[j]]++;
            }
            for(int j = 0; j < n; j++){
                if(cnt[a[j]] != -1){
                    System.out.println(a[j] + " xuat hien " + cnt[a[j]] + " lan");
                    cnt[a[j]] = -1;
                }
            }
        }
    }
    
}
