/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TinhGio;
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */

class G{
    private String id, name;
    private int g, p;
    private int sum;

    public G(Scanner sc) {
        id = sc.next();
        sc.nextLine();
        name = sc.nextLine();
        String vao = sc.next();
        String ra = sc.next();
        int phut = getTime(vao, ra);
        sum = phut;
        int gio = 0;
        while(phut >= 60){
            gio++;
            phut -= 60;
        }
        g = gio;
        p = phut;
    }
    static int getTime(String v, String r){
        int t1 = ((v.charAt(0)-'0')*10 + (v.charAt(1)-'0'))*60 + (v.charAt(3)-'0')*10+(v.charAt(4)-'0');
        int t2 = ((r.charAt(0)-'0')*10 + (r.charAt(1)-'0'))*60 + (r.charAt(3)-'0')*10+(r.charAt(4)-'0');
        return t2-t1;
    }
    public boolean cmp(G o){
        return o.sum > sum;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + g + " gio " + p + " phut";
    }
    
}

public class TinhGio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        G[] a = new G[n];
        for(int i = 0; i < n; i++){
            a[i] = new G(sc);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[i].cmp(a[j])){
                    G tmp = a[i];
                    a[i] =a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
    
}

/*
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
*/