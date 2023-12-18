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

class Product{
    private String id;
    private String name;
    private int price;
    private int wty;

    public Product(String id, String name, int price, int wty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.wty = wty;
    }
    public boolean cmp(Product o){
        if(price == o.price){
            return id.compareTo(o.id) < 1;
        }
        return price > o.price;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + wty;
    }
    
}

public class DanhSachSanPham2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        Product[] a = new Product[n+1];
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            int bh = Integer.parseInt(sc.nextLine());
            a[i] = new Product(ma, ten, gia, bh);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[j].cmp(a[i])){
                    Product tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
    
}
