/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HopVaGiaoCuaHaiFileVanBan;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;
/**
 *
 * @author QUYNH
 */

class Pair implements Comparable<Pair>{
    public String s;
    public int cnt;

    public Pair(String s, int cnt) {
        this.s = s;
        this.cnt = cnt;
    }

    @Override
    public int compareTo(Pair o) {
        return s.compareTo(o.s);
    }
    
}

public class HopVaGiaoCuaHaiFileVanBan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA1.in"));
        ArrayList<Pair> a = new ArrayList<>();
        while(sc.hasNext()){
            if(a.isEmpty()){
                a.add(new Pair(sc.next().toLowerCase(), 1));
            }
            else{
                String res = sc.next().toLowerCase();
                int ok = 1;
                for(Pair i : a){
                    if(i.s.equals(res)){
                        ok = 0;
                    }
                }
                if(ok == 1){
                    a.add(new Pair(res, 1));
                }
            }
        }
        sc = new Scanner(new File("DATA2.in"));
        while(sc.hasNext()){
            if(a.isEmpty()){
                a.add(new Pair(sc.next().toLowerCase(), 1));
            }
            else{
                String res = sc.next().toLowerCase();
                int ok = 0;
                for(Pair i : a){
                    if(i.s.equals(res)){
                        i.cnt++;
                        ok = 1;
                        break;
                    }
                }
                if(ok == 0){
                    a.add(new Pair(res, 1));
                }
            }
        }
        Collections.sort(a);
        for(Pair i : a){
            System.out.print(i.s + " ");
        }
        System.out.println();
        for(Pair i : a){
            if(i.cnt > 1){
                System.out.print(i.s + " ");
            }
        }
        System.out.println();
    }
    
}
