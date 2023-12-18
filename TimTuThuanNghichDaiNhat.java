/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;
import java.lang.Object;
import java.util.ArrayList;
/**
 *
 * @author QUYNH
 */
public class TimTuThuanNghichDaiNhat {
    public static class word{
        public String str;
        public int sl;
        public word(String str, int sl) {
            this.str = str;
            this.sl = sl;
        }
    }
    public static boolean check(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<word> a = new ArrayList<>();
        int size = 0;
        while(sc.hasNext()){
            String s = sc.next();
            if(!check(s) || size>s.length()) continue;
            if(size < s.length()){
                size = s.length();
                a.add(new word(s, 1));
                continue;
            }
            int lap = 0;
            for(int i = 0; i < a.size(); i++){
                if(a.get(i).str.contentEquals(s)){
                    lap = 1;
                    a.get(i).sl++;
                    break;
                }
            }
            if(lap == 0){
                size = s.length();
                a.add(new word(s, 1));
            }
        }
        for(word tmp : a){
            if(tmp.str.length() == size){
                System.out.println(tmp.str + " " + tmp.sl);
            }
        }
        sc.close();
    }
    
}
