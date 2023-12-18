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

class MonHoc{
    private String id;
    private String name;
    private int tc;
    private String lt;
    private String th;

    public MonHoc(String id, String name, int tc, String lt, String th) {
        this.id = id;
        this.name = name;
        this.tc = tc;
        this.lt = lt;
        this.th = th;
    }
    
    public boolean check(){
        return th.endsWith(".ptit.edu.vn") || th.equals("Truc tuyen");
    }
    
    public boolean cmp(MonHoc o){
        return id.compareTo(o.id) < 1;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + tc + " " + lt + " " + th;
    }
    
}

public class DangKyHinhThucGiangDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        MonHoc[] a = new MonHoc[n];
        for(int i = 0; i < n; i++){
            a[i] = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[j].cmp(a[i])){
                    MonHoc tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(a[i].check()){
                System.out.println(a[i]);
            }
        }
    }
    
}
