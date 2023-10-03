/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */

class Item{
    public String ma;
    public String ten;
    public String dv;
    public int mua;
    public int ban;
    public int lai;
    
    public Item(String ma, String ten, String dv, int mua, int ban, int lai) {
        this.ma = ma;
        this.ten = ten;
        this.dv = dv;
        this.mua = mua;
        this.ban = ban;
        this.lai = lai;
    }
    public boolean cmp(Item p){
        if(lai == p.lai){
            return Integer.valueOf(ma.substring(2)) > Integer.valueOf(p.ma.substring(2));
        }
        return lai < p.lai;
    }
    public void in(){
        System.out.println(ma + " " + ten + " " + dv + " " + mua + " " + ban + " " + lai);
    }
    
}

public class DanhSachMatHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Item[] a = new Item[n];
        int cnt = 1;
        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            String donvi = sc.next();
            int gm = sc.nextInt();
            int gb = sc.nextInt();
            sc.nextLine();
            int pro = gb-gm;
            String m = "MH" + String.format("%03d", cnt++);
            a[i] = new Item(m, name, donvi, gm, gb, pro);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[i].cmp(a[j])){
                    Item tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            a[i].in();
        }
    }
    
}
/*
2
Ao phong tre em
Cai
240000
515000
Ao khoac nam
Cai
240000
515000
*/