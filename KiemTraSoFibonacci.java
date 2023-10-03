/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class KiemTraSoFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        long f[] = new long[94];
        f[0] = 0;
        f[1] = f[2] = 1;
        for(int i = 3; i <= 93; i++){
            f[i] = f[i-1] + f[i-2];
        }
        while(TC-- > 0){
            long n = sc.nextLong();
            int check = 0;
            for(int i = 0; i <= 93; i++){
                if(f[i] == n){
                    check = 1;
                    break;
                }
            }
            if(check == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
