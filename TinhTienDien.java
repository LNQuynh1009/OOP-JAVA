/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
class Customer{
    private static int CurId = 0;
    private String id;
    private String name;
    private String type;
    private double in, out, vat, sum;

    public Customer(String name, String type, double f, double l, double dm) {
        this.id = "KH" + String.format("%02d", ++CurId);
        this.name = name;
        this.type = type;
        if((l-f) <= dm){
            this.in = (l-f)*450;
            this.out = 0;
            this.vat = 0;
        }
        else{
            this.in = (dm)*450;
            this.out = (l-f-dm)*1000;
            this.vat = this.out*5/100;
        }
        this.sum = this.in+this.out+this.vat;
    }
    public boolean cmp(Customer o){
        return sum > o.sum;
    }

    @Override
    public String toString() {
        return id + " " + name + String.format("%.0f", in) + " " + String.format("%.0f", out) + " " + String.format("%.0f", vat) + " " + String.format("%.0f", sum);
    }
}
/**
 *
 * @author QUYNH
 */
public class TinhTienDien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        Customer[] a = new Customer[n+1];
        for(int i = 0; i < n; i++){
            String[] res = sc.nextLine().trim().split("\\s+");
            String ten = "";
            for(String j : res){
                ten += j.toUpperCase().charAt(0) + j.toLowerCase().substring(1) + " ";
            }
            String loai = "";
            double dau  = 0;
            double cuoi = 0;
            String[] str = sc.nextLine().split(" ");
            loai = str[0];
            dau = Double.parseDouble(str[1]);
            cuoi = Double.parseDouble(str[2]);
            double dinhmuc = 0;
            if(loai.contains("A")){
                dinhmuc = 100;
            }
            else if(loai.contains("B")){
                dinhmuc = 500;
            }
            else dinhmuc = 200;
            a[i] = new Customer(ten, loai, dau, cuoi, dinhmuc);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[j].cmp(a[i])){
                    Customer tmp = a[i];
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
