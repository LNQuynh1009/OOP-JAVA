/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class LietKeToHop2 {

    /**
     * @param args the command line arguments
     */
    public static int[] a = new int[11];
    public static int n, k, cnt = 0;
    public static void print(){
        cnt++;
        for(int i = 1; i <= k; i++){
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
    public static void Try(int i){
        for(int j = a[i-1] + 1; j <= n-k+i; j++){
            a[i] = j;
            if(i == k){
                print();
            }
            else{
                Try(i+1);
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
    }
    
}
