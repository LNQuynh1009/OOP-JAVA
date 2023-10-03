/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class UocSoChiaHetCho2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            int n = sc.nextInt();
                int cnt = 0;
                for(int i = 1; i <= Math.sqrt(n); i++){
                    if(n%i == 0){
                        if(i%2 == 0){
                            cnt++;
                        }
                        if((n/i)%2 == 0 && i*i!=n){
                            cnt++;
                        }
                    }
                }
                System.out.println(cnt);
        }
    }
    
}
