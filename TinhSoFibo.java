/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class TinhSoFibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC= sc.nextInt();
        long f[] = new long[94];
        f[1] = f[2] = 1;
        for(int i = 3; i <= 93; i++){
            f[i] = f[i-1] + f[i-2];
        }
        while(TC-- > 0){
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
    
}
