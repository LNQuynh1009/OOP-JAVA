/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class DanhSachKe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        byte[][] a = new byte[n+5][n+5];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                a[i][j] = sc.nextByte();
            }
        }
        for(int i = 1; i <= n; i++){
            System.out.print("List(" + i + ") = ");
            for(int j = 1; j <= n; j++){
                if(a[i][j] == 1){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    
}
