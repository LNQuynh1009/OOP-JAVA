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
public class DayNgoacDungDaiNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            String s = sc.next();
            int res = -1;
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '('){
                    st.push(i);
                }
                else{
                    st.pop();
                    if(st.empty()){
                        st.push(i);
                    }
                    else{
                        res = Math.max(res, i-st.peek());
                    }
                }
            }
            System.out.println(res);
        }
    }
    
}
