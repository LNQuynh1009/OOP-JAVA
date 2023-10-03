/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class DayUuThe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        sc.nextLine();
        while(TC-- > 0){
            String s = sc.nextLine().trim();
            String[] str = s.split(" ");
            int n = str.length;
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = Integer.parseInt(str[i]);
            }
            int chan = 0;
            for(int i = 0; i < n; i++){
                if(a[i] % 2 == 0){
                    chan++;
                }
            }
            if((n%2 == 0 && chan > n-chan) || (n%2 !=0 && chan < n-chan)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
