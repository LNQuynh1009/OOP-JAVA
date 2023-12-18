/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.lang.Comparable;
import java.util.Collections;
/**
 *
 * @author QUYNH
 */

class Khach implements Comparable<Khach>{
    private String id;
    private String name;
    private String rid;
    private Long days;
    private Long sum;

    public Khach(String id, String name, String rid, Long days, Long sum) {
        this.id = id;
        this.name = name;
        this.rid = rid;
        this.days = days;
        this.sum = sum;
    }
    @Override
    public int compareTo(Khach o) {
        return -(Integer.parseInt(sum.toString()) - Integer.parseInt(o.sum.toString()));
    }

    @Override
    public String toString() {
        return id + " " + name + " " + rid + " " + days + " " + sum;
    }
    
}

public class TinhTienPhong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Khach> a = new ArrayList<>();
        SimpleDateFormat dft = new SimpleDateFormat("dd/MM/yyyy");
        for(int i = 1; i <= n; i++){
            String ma = "KH" + String.format("%02d", i);
            String[] res = sc.nextLine().split("\\s+");
            String ten = "";
            for(String j : res){
                ten += j.toUpperCase().charAt(0) + j.toLowerCase().substring(1) + " ";
            }
            String phong = sc.nextLine();
            Date d1 = dft.parse(sc.nextLine());
            Date d2 = dft.parse(sc.nextLine());
            Long giay = d2.getTime() - d1.getTime();
            Long ngay = (giay)/(1000L*60*60*24) + 1;
            Long dv = Long.parseLong(sc.nextLine());
            Long tt = 0L;
            if(phong.charAt(0) == '1'){
                tt = 25L*ngay + dv;
            }
            else if(phong.charAt(0) == '2'){
                tt = 34L*ngay + dv;
            }
            else if(phong.charAt(0) == '3'){
                tt = 50L*ngay + dv;
            }
            else tt = 80L*ngay + dv;
            a.add(new Khach(ma, ten, phong, ngay, tt));
        }
        Collections.sort(a);
        for(Khach i : a){
            System.out.println(i);
        }
    }
    
}

/*
3
Huynh VAN Thanh   
103 
5/6/2010   
5/6/2010   
15
le   DUC cong  
106 
08/3/2010   
1/5/2010   
220
Tran Thi Bich Tuyen   
207 
10/4/2010   
21/4/2010   
96
*/