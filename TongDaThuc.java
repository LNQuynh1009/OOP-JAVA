/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TongDaThuc;
import java.util.Scanner;
import java.util.Objects;
import java.util.ArrayList;
/**
 *
 * @author QUYNH
 */

class DaThuc{
    public ArrayList<Integer> mu;
    public ArrayList<Integer> hs;

    public DaThuc(ArrayList<Integer> mu, ArrayList<Integer> hs) {
        this.mu = mu;
        this.hs = hs;
    }
    public DaThuc(String s){
        String[] data = s.split(" \\+ ");
        ArrayList<Integer> h = new ArrayList<>();
        ArrayList<Integer> sm = new ArrayList<>();
        for(String i : data){
            h.add(Integer.parseInt(i.substring(0, i.indexOf('*'))));
            sm.add(Integer.parseInt(i.substring(i.indexOf('^')+1)));
        }
        this.hs = h;
        this.mu = sm;
    }
    public DaThuc cong(DaThuc b){
        ArrayList<Integer> h = new ArrayList<>();
        ArrayList<Integer> sm = new ArrayList<>();
        int i = 0, j = 0;
        while(i < this.mu.size() && j < b.mu.size()){
            if(Objects.equals(this.mu.get(i), b.mu.get(j))){
                sm.add(this.mu.get(i));
                h.add(this.hs.get(i)+b.hs.get(j));
                i++;
                j++;
            }
            else if(this.mu.get(i) > b.mu.get(j)){
                sm.add(this.mu.get(i));
                h.add(this.hs.get(i));
                i++;
            }
            else{
                sm.add(b.mu.get(j));
                h.add(b.hs.get(j));
                j++;
            }
        }
        while(i < this.mu.size()){
            sm.add(this.mu.get(i));
            h.add(this.hs.get(i));
            i++;
        }
        while(j < b.mu.size()){
            sm.add(b.mu.get(j));
            h.add(b.hs.get(j));
            j++;
        }
        return new DaThuc(sm, h);
    }
    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < this.mu.size(); i++){
            s += this.hs.get(i) + "*x^" + this.mu.get(i);
            if(i < this.mu.size()-1){
                s += " + ";
            }
        }
        return s;
    }
    
}

public class TongDaThuc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
    
}

/*
1
3*x^8 + 7*x^2 + 4*x^0
11*x^6 + 9*x^2 + 2*x^1 + 3*x^0
*/