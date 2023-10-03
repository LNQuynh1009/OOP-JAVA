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
public class PhanTuBenPhaiDauTienLonHon {

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
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int[] b = new int[n];
            b[n-1] = -1;
            Stack<Integer> st = new Stack<Integer>();
            st.add(a[n-1]);
            for(int i = n-2; i >= 0; i--){
                while(!st.empty()){
                    if(st.peek() > a[i]){
                        b[i] = st.peek();
                        st.add(a[i]);
                        break;
                    }
                    else{
                        st.pop();
                    }
                }
                if(st.empty()){
                    b[i] = -1;
                    st.add(a[i]);
                }
            }
            for(int i = 0; i < n; i++){
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }
    
}
