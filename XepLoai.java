/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.io.File;
/**
 *
 * @author QUYNH
 */

class Student{
    private static int curId = 0;
    private String id;
    private String name;
    private double p1, p2, p3;
    private double sum;

    public Student(String name, double p1, double p2, double p3) {
        this.id = "SV" + String.format("%02d", ++curId);
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.sum = ((p1*25)/100 + (p2*35)/100 + (p3*40)/100);
    }
    public boolean cmp(Student o){
        if(sum == o.sum){
            return id.compareTo(o.id) < 1;
        }
        return sum > o.sum;
    }

    public double getSum() {
        return sum;
    }
    
    @Override
    public String toString() {
        return id + " " + name + String.format("%.2f ", sum);
    }
    
}
        
public class XepLoai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        Student[] a = new Student[n+1];
        for(int i = 0; i < n; i++){
            String[] res = sc.nextLine().trim().split("\\s+");
            String ten = "";
            for(String j : res){
                ten += j.toUpperCase().charAt(0) + j.toLowerCase().substring(1) + " ";
            }
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            a[i] = new Student(ten, d1, d2, d3);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[j].cmp(a[i])){
                    Student tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(a[i].getSum() >= 8){
                System.out.println(a[i] + "GIOI");
            }
            else if(a[i].getSum() >= 6.5){
                System.out.println(a[i] + "KHA");
            }
            else if(a[i].getSum() >= 5){
                System.out.println(a[i] + "TRUNG BINH");
            }
            else System.out.println(a[i] + "KEM");
        }
    }
}
