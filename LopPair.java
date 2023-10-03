/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */

class Pair<T, S> {
    private T t;
    private S s;

    public Pair() {
    }

    public Pair(T t, S s) {
        this.t = t;
        this.s = s;
    }
    public boolean isPrime(){
        for(int i = 2; i <= Math.sqrt(Integer.parseInt(t.toString())); i++){
            if((Integer.parseInt(t.toString()))%i == 0){
                return false;
            }
        }
        for(int i = 2; i <= Math.sqrt(Integer.parseInt(s.toString())); i++){
            if((Integer.parseInt(s.toString()))%i == 0){
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString() {
        return t + " " + s;
    }
    
}

public class LopPair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
    
}
