/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TenVietTat;
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

class Person implements Comparable<Person>{
    public String full, vt, chinh;

    public Person(Scanner sc) {
        this.full = sc.nextLine();
        this.vt = VT(this.full);
        this.chinh = tc(this.full);
    }
    static String VT(String s){
        String[] data = s.split(" ");
        String res = "";
        for(String tmp : data){
            res += tmp.toUpperCase().charAt(0) + ".";
        }
        return res.substring(0, res.length()-1);
    }
    static String tc(String s){
        String[] data = s.split("\\s+");
        return data[data.length-1];
    }

    @Override
    public String toString() {
        return this.full;
    }

    @Override
    public int compareTo(Person o) {
        if(this.chinh.contentEquals(o.chinh)){
            return this.full.compareTo(o.full);
        }
        return this.chinh.compareTo(o.chinh);
    }
}

public class TenVietTat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Person> a = new ArrayList<>();
        while(t-- > 0){
            a.add(new Person(sc));
        }
        Collections.sort(a);
        t = sc.nextInt();
        while(t-- > 0){
            String q = sc.next();
            int k = q.indexOf("*");
            for(Person tmp : a){
                if(k == -1){
                    if(tmp.vt.contentEquals(q)) System.out.println(tmp);
                }
                else if(tmp.vt.substring(0, k).contentEquals(q.substring(0, k)) && tmp.vt.substring(k+1).contentEquals(q.substring(k+1))){
                    System.out.println(tmp);
                }
            }
        }
    }
    
}

/*
4
Nguyen Manh Son
Ngo4 Minh Tuan
Nguyen Manh Hung
Tran Trung Dung
1
N.M.*
*/