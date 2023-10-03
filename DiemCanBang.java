/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class DiemCanBang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            sum -= a[0];
            int d = a[0];
            if(sum == 0){
                System.out.println("1");
            }
            else{
                int ok = 0;
                for(int i = 1; i < n; i++){
                    sum -= a[i];
                    if(sum == d){
                        ok = 1;
                        System.out.println(i+1);
                        break;
                    }
                    d += a[i];
                }
                if(ok == 0){
                    System.out.println("-1");
                }
            }
        }
    }
    
}
