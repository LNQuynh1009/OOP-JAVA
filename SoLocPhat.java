/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Admin
 */
public class SoLocPhat {

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
            ArrayList<String> a = new ArrayList<>();
            q.add("6");
            q.add("8");
            while(q.peek().length() < n){
                String tmp = q.poll();
                a.add(tmp);
                q.add(tmp + "6");
                q.add(tmp + "8");
            }
            while(!q.isEmpty()){
                a.add(q.poll());
            }
            System.out.println(a.size());
            Collections.reverse(a);
            for(String i : a){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
}
