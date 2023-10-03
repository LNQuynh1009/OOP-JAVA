/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;
/**
 *
 * @author Admin
 */

class Num{
    int val;
    int step;

    public Num(int val, int step) {
        this.val = val;
        this.step = step;
    }
    
}

public class BienDoiST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            HashSet<Integer> visited = new HashSet<>();
            Queue<Num> q = new LinkedList<>();
            int s = sc.nextInt();
            int t = sc.nextInt();
            Num node = new Num(s, 0);
            q.offer(node);
            while(!q.isEmpty()){
                Num tmp = q.poll();
                if(visited.contains(tmp.val)){
                    continue;
                }
                visited.add(tmp.val);
                if(tmp.val == t){
                    System.out.println(tmp.step);
                }
                int mul = tmp.val*2;
                int sub = tmp.val-1;
                if(mul > 0 && mul < t*2){
                    Num nodeMul = new Num(mul, tmp.step+1);
                    q.offer(nodeMul);
                }
                if(sub > 0){
                    Num nodeSub = new Num(sub, tmp.step+1);
                    q.offer(nodeSub);
                }
                
            }
        }
    }
    
}
