/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;
/**
 *
 * @author QUYNH
 */

class CaThi implements Comparable<CaThi>{
    private static int CurId = 1;
    private String id;
    private String day;
    private String time;
    private String room;

    public CaThi(String ngay, String gio, String phong) {
        this.id = "C" + String.format("%03d", CurId++);
        if(ngay.charAt(2) != '/'){
            ngay = "0" + ngay;
        }
        if(ngay.charAt(5) != '/'){
            ngay = ngay.substring(0, 3) + "0" + ngay.substring(3);
        }
        this.day = ngay;
        if(gio.charAt(2) != ':'){
            gio = "0" + gio;
        }
        if(gio.length() != 5){
            gio = gio.substring(0, 3) + "0" + gio.substring(3);
        }
        this.time = gio;
        this.room = phong;
    }

    @Override
    public int compareTo(CaThi o) {
        if(!day.equals(o.day)) return day.compareTo(o.day);
        if(!time.equals(o.time)) return time.compareTo(o.time);
        return id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id + " " + day + " " + time + " " + room;
    }
    
}

public class DanhSachCaThi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.next());
        sc.nextLine();
        ArrayList<CaThi> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(new CaThi(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for(CaThi i : a){
            System.out.println(i);
        }
    }
    
}
