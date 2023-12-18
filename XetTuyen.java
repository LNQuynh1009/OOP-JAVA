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

class XT{
    private static int cId = 0;
    private String id;
    private String name;
    private int age;
    private int gpa;
    private String status;

    public XT(String name, int age, int gpa, String status) {
        this.id = "PH" + String.format("%02d", ++cId);
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.status = status;
    }

    @Override
    public String toString() {
        return id + " " + name + age + " " + gpa + " " + status;
    }
    
}

public class XetTuyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        XT[] a = new XT[n+1];
        for(int i = 0; i < n; i++){
            String[] res = sc.nextLine().trim().split("\\s+");
            String ten = "";
            for(String j : res){
                ten += j.toUpperCase().charAt(0) + j.toLowerCase().substring(1) + " ";
            }
            String[] ns = sc.nextLine().split("/");
            int tuoi = 2021 - Integer.parseInt(ns[2]);
            double lt = Double.parseDouble(sc.nextLine());
            double th = Double.parseDouble(sc.nextLine());
            double thuong = 0;
            if(lt >= 8 && th >= 8){
                thuong = 1;
            }
            else if(lt >= 7.5 && th >= 7.5){
                thuong  = 0.5;
            }
            else thuong = 0;
            int diem = (int)Math.round((lt+th)/2 + thuong);
            if(diem > 10) diem = 10;
            String tt = "";
            if(diem > 8){
                tt = "Xuat sac";
            }
            else if(diem > 7){
                tt = "Gioi";
            }
            else if(diem > 6){
                tt = "Kha";
            }
            else if(diem >= 5){
                tt = "Trung binh";
            }
            else tt = "Truot";
            a[i] = new XT(ten, tuoi, diem, tt);
        }
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
    
}
