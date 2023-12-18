/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuanLyKhachSan;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author QUYNH
 */

class R{
    public String c;
    public String name;
    public double gia;
    public double dvu;

    public R(Scanner sc) {
        c = sc.next();
        name = sc.next();
        gia = sc.nextDouble();
        dvu = sc.nextDouble();
    }
    public R() {
    }
    
}

class KH extends R{
    private static int cur = 1;
    private String id, ten, room;
    private long day;
    private double sum;

    public KH(Scanner sc, R[] a) throws ParseException {
        id = "KH" + String.format("%02d", cur++);
        ten = sc.nextLine();
        room = sc.next();
        for(R i : a){
            if(i.c.contentEquals(this.room.substring(2, 3))){
                this.gia = i.gia;
                this.dvu = i.dvu;
                break;
            }
        }
        try{
            String den = sc.next();
            String di = sc.next();
            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date d1 = sdf.parse(den);
            Date d2 = sdf.parse(di);
            day = (d2.getTime()-d1.getTime())/(24*60*60*1000);
        } catch(ParseException ex){
            Logger.getLogger(QuanLyKhachSan.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(day == 0){
            day = 1;
        }
        sum = day*this.gia + day*this.gia*this.dvu;
        if(day >= 30){
            sum *= (1-0.06);
        }
        else if(day >= 20){
            sum *= (1-0.04);
        }
        else if(day >= 10){
            sum *= (1-0.02);
        }
        else sum = sum*1.0;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + room + " " + day + " " + String.format("%.2f", sum);
    }
    public boolean cmp(KH o){
        return o.day > day;
    }
}

public class QuanLyKhachSan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt();
        R[] a = new R[n];
        for(int i = 0; i < n; i++){
            a[i] = new R(sc);
        }
        int m = sc.nextInt();
        KH[] b = new KH[m];
        for(int i = 0; i < m; i++){
            sc.nextLine();
            b[i] = new KH(sc, a);
        }
        for(int i = 0; i < m-1; i++){
            for(int j = i; j < m; j++){
                if(b[i].cmp(b[j])){
                    KH tmp = b[i];
                    b[i] = b[j];
                    b[j] = tmp;
                }
            }
        }
        for(int i = 0; i < m; i++){
            System.out.println(b[i]);
        }
    }
    
}
