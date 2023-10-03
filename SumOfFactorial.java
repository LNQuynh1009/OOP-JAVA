/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class SumOfFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] s = new long[21];
        s[1] = 1;
        long sum = 0;
        sum += s[1];
        for(int i = 2; i <= n; i++){
            s[i] = i*s[i-1];
            sum += s[i];
        }
        System.out.println(sum);
    }
    
}
