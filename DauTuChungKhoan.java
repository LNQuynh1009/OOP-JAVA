/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Admin
 */
public class DauTuChungKhoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            int[] c = new int[n+1];
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            for(int i = 1; i <= n; i++){
                while(!st.empty() && a[i] >= a[st.peek()]) st.pop();
                if(st.empty()) c[i] = 0;
                else c[i] = st.peek();
                st.push(i);
            }
            for(int i = 1; i <= n; i++){
                System.out.print(i-c[i] + " ");
            }
            System.out.println();
        }
    }
    
}
