/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */

class SinhVien{
    private String name;
    private int ac;
    private long submit;

    public SinhVien(String name, int ac, long submit) {
        this.name = name;
        this.ac = ac;
        this.submit = submit;
    }
    
    public boolean cmp(SinhVien o){
        if(ac != o.ac){
            return ac > o.ac;
        }
        if(submit != o.submit){
            return submit < o.submit;
        }
        return name.compareTo(o.name) < 1;
    }

    @Override
    public String toString() {
        return name + " " + ac + " " + submit;
    }
    
}

public class BangXepHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SinhVien[] a = new SinhVien[n+1];
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            int dung = sc.nextInt();
            long nop = sc.nextInt();
            sc.nextLine();
            a[i] = new SinhVien(ten, dung, nop);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[j].cmp(a[i])){
                    SinhVien tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(a[i].toString());
        }
    }
    
}

/*
2
Nguyen Van Nam
168 600
Tran Thi Ngoc
168 500
*/