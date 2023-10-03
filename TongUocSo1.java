/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class TongUocSo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sieve();
        long sum = 0;
        for(int i = 0; i < t; i++){
            int x = sc.nextInt();
            sum += cal(x);
        }
        System.out.println(sum);
    }
    
    public static final int N = (int) 2e6;
    public static int[] prime = new int[N+5];
    public static void sieve(){
        for(int i = 2; i*i <= N; i++){
            if(prime[i] == 0){
                for(int j = i; j <= N; j += i){
                    if(prime[j] == 0){
                        prime[j] = i;
                    }
                }
            }
        }
        for(int i = 2; i <= N; i++){
            if(prime[i] == 0){
                prime[i] = i;
            }
        }
    }
    
    public static int cal(int n){
        if(prime[n] == 0){
            return n;
        }
        int sum = 0;
        while(n!=1){
            sum += prime[n];
            n /= prime[n];
        }
        return sum;
    }
}
