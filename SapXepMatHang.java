/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
/**
 *
 * @author QUYNH
 */

class MatHang{
    private String id;
    private String name;
    private String group;
    private double buy;
    private double sell;

    public MatHang(String id, String name, String group, double buy, double sell) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.buy = buy;
        this.sell = sell;
    }
    public boolean cmp(MatHang o){
        return (sell-buy) > (o.sell-o.buy);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + String.format("%.2f", sell-buy);
    }
}

public class SapXepMatHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        MatHang[] a = new MatHang[n+1];
        for(int i = 1; i <= n; i++){
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            double mua = Double.parseDouble(sc.nextLine());
            double ban = Double.parseDouble(sc.nextLine());
            String ma = "MH" + String.format("%02d", i);
            a[i] = new MatHang(ma, ten, nhom, mua, ban);
        }
        for(int i = 1; i < n; i++){
            for(int j = i; j <= n; j++){
                if(a[j].cmp(a[i])){
                    MatHang tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 1; i <= n; i++){
            System.out.println(a[i]);
        }
    }
    
}
