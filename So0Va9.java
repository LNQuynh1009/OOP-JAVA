/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author Admin
 */
public class So0Va9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<String>();
            q.add("9");
            while(Long.valueOf(q.peek()) % n != 0){
                String tmp = q.poll();
                q.add(tmp + "0");
                q.add(tmp + "9");
            }
            System.out.println(q.peek());
        }
    }
    
}
