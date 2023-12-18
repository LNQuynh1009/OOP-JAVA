/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.ParseException;
/**
 *
 * @author QUYNH
 */

class Company{
    private String id;
    private String name;
    private int stu;

    public Company(String id, String name, int stu) {
        this.id = id;
        this.name = name;
        this.stu = stu;
    }
    public boolean cmp(Company o){
        return id.compareTo(o.id) < 1;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + stu;
    }
}

public class DanhSachDoanhNghiep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        Company[] a = new Company[n+1];
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int sl = Integer.parseInt(sc.nextLine());
            a[i] = new Company(ma, ten, sl);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[j].cmp(a[i])){
                    Company tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
    
}
