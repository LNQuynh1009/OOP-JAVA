/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
/**
 * 
 *
 * @author QUYNH
 */

class ThiSinh implements Comparable<ThiSinh>{
    private static int CurId = 1;
    private String id;
    private String name;
    private double sum;
    private String status;

    public ThiSinh(String ten, double diemthi, String dantoc, int kv) {
        this.id = "TS" + String.format("%02d", CurId++);
        String[] res = ten.split("\\s+");
        String ans = "";
        for(String i : res){
            ans += i.toUpperCase().charAt(0) + i.toLowerCase().substring(1) + " ";
        }
        this.name = ans;
        if(kv == 1){
            sum = diemthi + 1.5;
        }
        if(kv == 2){
            sum = diemthi + 1;
        }
        if(kv == 3){
            sum = diemthi;
        }
        if(!dantoc.equals("Kinh")){
            sum += 1.5;
        }
        if(sum < 20.5){
            status  = "Truot";
        }
        else status = "Do";
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(sum > o.sum) return -1;
        if(sum < o.sum) return 1;
        return id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sum + " " + status;
    }
    
}

public class DiemTuyenSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.next());
        sc.nextLine();
        ArrayList<ThiSinh> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine().trim();
            double diemthi = Double.parseDouble(sc.nextLine());
            String dantoc = sc.nextLine();
            int kv = Integer.parseInt(sc.nextLine());
            a.add(new ThiSinh(ten, diemthi, dantoc, kv));
        }
        Collections.sort(a);
        for(ThiSinh i : a){
            System.out.println(i);
        }
    }
    
}
