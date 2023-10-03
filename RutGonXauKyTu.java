/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class RutGonXauKyTu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(!st.empty()){
                if(st.peek() != s.charAt(i)){
                    st.push(s.charAt(i));
                }
                else{
                    st.pop();
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String res = "";
        if(st.empty()){
            System.out.println("Empty String");
        }
        else{
            while(!st.empty()){
                res += st.peek();
                st.pop();
            }
            for(int i = res.length()-1; i >= 0; i--){
                System.out.print(res.charAt(i));
            }
            System.out.println();
        }
    }
    
}
