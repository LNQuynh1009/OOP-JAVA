/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.io.File;
import java.util.Scanner;
import java.time.Duration;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
/**
 *
 * @author QUYNH
 */

class KhachHang{
    private String id;
    private String name;
    private String room;
    private Long days;

    public KhachHang(String id, String name, String room, Long days) {
        this.id = id;
        this.name = name;
        this.room = room;
        this.days = days;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + room + " " + days;
    }
    public boolean cmp(KhachHang o){
        return days > o.days;
    }
}

public class DanhSachLuuTru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        KhachHang[] a = new KhachHang[n+1];
        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
        for(int i = 1; i <= n; i++){
            String ma = "KH" + String.format("%02d", i);
            String ten = sc.nextLine();
            String phong = sc.nextLine();
            String den = sc.nextLine();
            String di = sc.nextLine();
            Date d1 = dtf.parse(den);
            Date d2 = dtf.parse(di);
            Long d = d2.getTime() - d1.getTime();
            Long ngay = (d / (1000L*60*60*24));
            a[i] = new KhachHang(ma, ten, phong, ngay);
        }
        for(int i = 1; i < n; i++){
            for(int j = i; j <= n; j++){
                if(a[j].cmp(a[i])){
                    KhachHang tmp = a[i];
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
