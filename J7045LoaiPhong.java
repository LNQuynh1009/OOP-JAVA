/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.Collections;
import java.lang.Comparable;
import java.util.ArrayList;
/**
 *
 * @author QUYNH
 */

class LoaiPhong implements Comparable<LoaiPhong>{
    private String sign;
    private String name;
    private String price;
    private String service;

    public LoaiPhong(String s) {
        String[] str = s.split(" ");
        sign = str[0];
        name = str[1];
        price = str[2];
        service = str[3];
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return sign + " " + name + " " + price + " " + service;
    }
    
}

public class J7045LoaiPhong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    
}
