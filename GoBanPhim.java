/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XayConDaiNhat;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author QUYNH
 */
public class GoBanPhim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '<':
                    if(!st1.isEmpty()) st2.push(st1.pop());
                    break;
                case '>':
                    if(!st2.isEmpty()) st1.push(st2.pop());
                    break;
                case '-':
                    if(!st1.isEmpty()) st1.pop();
                    break;
                default:
                    st1.push(s.charAt(i));
                    break;
            }
        }
        while(!st1.isEmpty()) st2.push(st1.pop());
        while(!st2.isEmpty()) System.out.print(st2.pop());
        System.out.println();
    }
    
}
