/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author QUYNH
 */

class Item{
    private String id;
    private String name;
    private double discount;
    private double sum;

    public Item(String id, String name, double discount, double sum) {
        this.id = id;
        this.name = name;
        this.discount = discount;
        this.sum = sum;
    }
    
    public boolean cmp(Item o){
        return discount > o.discount;
    }

    public void in(){
        System.out.print(id + " " + name + " ");
        System.out.printf("%.0f ", discount);
        System.out.printf("%.0f\n", sum);
    }
    
}

class Pair{
    public String x;
    public int y;

    public Pair(String x, int y) {
        this.x = x;
        this.y = y;
    }
    
}

public class BangKeNhapKho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Item[] a = new Item[n+1];
        ArrayList<Pair> cnt = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String ten = sc.nextLine();
            String[] tmp = ten.split(" ");
            String ma = (Character.toString(tmp[0].charAt(0))).toUpperCase() + (Character.toString(tmp[1].charAt(0))).toUpperCase();
            if(cnt.isEmpty()){
                cnt.add(new Pair(ma, 1));
                ma = ma + "01";
            }
            else{
                int ok = 0;
                for(Pair j : cnt){
                    if(j.x.equals(ma)){
                        ok = 1;
                        j.y++;
                        ma = ma + String.format("%02d", j.y);
                        break;
                    }
                }
                if(ok == 0){
                    cnt.add(new Pair(ma, 1));
                    ma = ma + "01";
                }
            }
            double amount = sc.nextDouble();
            double price = sc.nextDouble();
            sc.nextLine();
            double ck = 0;
            if(amount > 10){
                ck = ((price * amount)*5)/100;
            }
            else if(amount >= 8 && amount <= 10){
                ck = ((price * amount)*2)/100;
            }
            else if(amount >= 5 && amount < 8){
                ck = ((price * amount)*1)/100;
            }
            double tien = price*amount - ck;
            a[i] = new Item(ma, ten, ck, tien);
        }
        for(int i = 1; i < n; i++){
            for(int j = i; j <= n; j++){
                if(a[j].cmp(a[i])){
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
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
*/