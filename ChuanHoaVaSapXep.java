/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.lang.Comparable;
/**
 *
 * @author QUYNH
 */

class Name implements Comparable<Name>{
    private String ho;
    private String ten;
    private String dem;

    public Name(String[] res) {
        String d = "";
        for(int i = 1; i < res.length-1; i++){
            d += res[i].toUpperCase().charAt(0) + res[i].toLowerCase().substring(1) + " ";
        }
        dem = d;
        ho = res[0].toUpperCase().charAt(0) + res[0].toLowerCase().substring(1);
        ten = res[res.length-1].toUpperCase().charAt(0) + res[res.length-1].toLowerCase().substring(1);
    }

    @Override
    public int compareTo(Name o) {
        if(!ten.equals(o.ten)){
            return ten.compareTo(o.ten);
        }
        if(!ho.equals(o.ho)){
            return ho.compareTo(o.ho);
        }
        return dem.compareTo(o.dem);
    }

    @Override
    public String toString() {
        return ho + " " + dem + ten;
    }
    
}

public class ChuanHoaVaSapXep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> a = new ArrayList<>();
        while(sc.hasNextLine()){
            a.add(new Name(sc.nextLine().trim().split("\\s+")));
        }
        Collections.sort(a);
        for(Name i : a){
            System.out.println(i);
        }
    }
    
}
