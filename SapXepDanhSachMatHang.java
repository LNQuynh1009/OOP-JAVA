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
    public int id;
    public String name;
    public String cate;
    public double buy;
    public double sell;
    public double profit;

    public Item(int id, String name, String cate, double buy, double sell, double profit) {
        this.id = id;
        this.name = name;
        this.cate = cate;
        this.buy = buy;
        this.sell = sell;
        this.profit = profit;
    }
    public boolean cmp(Item i){
        return profit < i.profit;
    }
    public void in(){
        System.out.print(id + " " + name + " " + cate + " ");
        System.out.printf("%.2f", profit);
        System.out.println();
    }
}

public class SapXepDanhSachMatHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Item[] a = new Item[n+1];
        for(int i = 1; i <= n; i++){
            int ma = i;
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            double mua = sc.nextDouble();
            double ban = sc.nextDouble();
            sc.nextLine();
            double lai = ban - mua;
            a[i] = new Item(ma, ten, nhom, mua, ban, lai);
        }
        for(int i = 1; i <= n-1; i ++){
            for(int j = i; j <= n; j++){
                if(a[i].cmp(a[j])){
                    Item tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 1; i <= n; i++){
            a[i].in();
        }
    }
    
}

/*
3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
*/