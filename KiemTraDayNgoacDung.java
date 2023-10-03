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
public class KiemTraDayNgoacDung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            String s = sc.next();
            Stack<Character> st = new Stack<Character>();
            for(int i = 0; i < s.length(); i++){
                if(!st.empty()){
                    if(s.charAt(i) == ')' && st.peek() == '('){
                        st.pop();
                    }
                    else if(s.charAt(i) == ']' && st.peek() == '['){
                        st.pop();
                    }
                    else if(s.charAt(i) == '}' && st.peek() == '{'){
                        st.pop();
                    }
                    else{
                        st.push(s.charAt(i));
                    }
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            if(!st.empty()){
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
    
}
