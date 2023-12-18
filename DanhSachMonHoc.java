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

class Subject{
    private String id;
    private String name;
    private int credit;

    public Subject(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }
    public boolean cmp(Subject o){
        return name.compareTo(o.name) < 1;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + credit; 
    }
    
}

public class DanhSachMonHoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        Subject[] a = new Subject[n+1];
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int tc = Integer.parseInt(sc.nextLine());
            a[i] = new Subject(ma, ten, tc);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[j].cmp(a[i])){
                    Subject tmp = a[i];
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
