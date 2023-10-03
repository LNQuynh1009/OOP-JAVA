/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */

class Student{
    public String ma;
    public String ten;
    public String lop;
    public String ns;
    public double diem;

    public Student(String ma, String ten, String lop, String ns, double diem) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.diem = diem;
    }
    public void in(){
        System.out.print(ma + " " + ten + " " + lop + " " + ns + " ");
        System.out.printf("%.2f", diem);
        System.out.println();
    }
}

public class DanhSachDoiTuongSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Student[] a = new Student[n+1];
        for(int i = 1; i <= n; i++){
            String id = "B20DCCN" + String.format("%03d", i);
            String name = sc.nextLine();
            String Class = sc.next();
            String date = sc.next();
            if(date.charAt(2) != '/'){
                date = "0" + date;
            }
            if(date.charAt(5) != '/'){
                date = date.substring(0, 3) + "0" + date.substring(3);
            }
            double p = sc.nextDouble();
            sc.nextLine();
            a[i] = new Student(id, name, Class, date, p);
        }
        for(int i = 1; i <= n; i++){
            a[i].in();
        }
    }
    
}
