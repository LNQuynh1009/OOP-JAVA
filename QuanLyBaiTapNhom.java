/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuanLyBaiTapNhom;
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */

class SV{
    private String id, name, sdt, bt;
    private int g;

    public SV(Scanner sc) {
        id = sc.next();
        sc.nextLine();
        name = sc.nextLine();
        sdt = sc.next();
        g = sc.nextInt();
    }
    public void setBt(String bt) {
        this.bt = bt;
    }
    public int getG() {
        return g;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + sdt + " " + g + " " + bt;
    }
    public boolean cmp(SV o){
        return o.id.compareTo(id) < 1;
    }
}

class N{
    private String btl;
    private int so;

    public N(Scanner sc, int i) {
        btl = sc.nextLine();
        this.so = i;
    }
    public String getBtl() {
        return btl;
    }
    public int getSo() {
        return so;
    }
}

public class QuanLyBaiTapNhom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        SV[] a = new SV[n];
        N[] b = new N[m];
        for(int i = 0; i < n; i++){
            a[i] = new SV(sc); 
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[i].cmp(a[j])){
                    SV tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        sc.nextLine();
        for(int i = 0; i < m; i++){
            b[i] = new N(sc, i+1); 
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(a[j].getG() == b[i].getSo()){
                    a[j].setBt(b[i].getBtl());
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
    
}

/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
*/