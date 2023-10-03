/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class ThuGonDaySo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(!st.empty()){
                if((st.peek()+x) % 2 != 0){
                    st.push(x);
                }
                else{
                    st.pop();
                }
            }
            else{
                st.push(x);
            }
        }
        System.out.println(st.size());
    }
    
}
