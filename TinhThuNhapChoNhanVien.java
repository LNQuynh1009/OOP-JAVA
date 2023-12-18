/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author 503
 */

class Employee{
    private String id;
    private String name;
    private double bonus;
    private double salary;
    private double tmp;
    private double excess;

    public Employee(String id, String name, double bonus, double salary, double tmp, double excess) {
        this.id = id;
        this.name = name;
        this.bonus = bonus;
        this.salary = salary;
        this.tmp = tmp;
        this.excess = excess;
    }
    public void in(){
        System.out.print(id + " " + name + " ");
        System.out.printf("%.0f ", bonus);
        System.out.printf("%.0f ", salary);
        System.out.printf("%.0f ", tmp);
        System.out.printf("%.0f\n", excess);
    }
}

public class TinhThuNhapChoNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] a = new Employee[n+1];
        String[] b = new String[n+1];
        for(int i = 1; i <= n; i++){
            String ma = "NV" + String.format("%02d", i);
            String ten = sc.nextLine();
            String chuc = sc.next();
            b[i] = chuc;
            double luong = sc.nextDouble();
            double ngay = sc.nextDouble();
            if(i != n){
                sc.nextLine();
            }
            double phu = 0;
            if(chuc.equals("GD")){
                phu = 500;
            }
            else if(chuc.equals("PGD")){
                phu = 400;
            }
            else if(chuc.equals("TP")){
                phu = 300;
            }
            else if(chuc.equals("KT")){
                phu = 250;
            }
            else{
                phu = 100;
            }
            double sal = luong*ngay;
            double tam = 0;
            if(((phu+sal)*2)/3 < 25000){
                tam = Math.round(((((phu+sal)*2)/3)/1000))*1000;
            }
            else{
                tam = 25000;
            }
            double conlai = (sal+phu) - (int)tam;
            a[i] = new Employee(ma, ten, phu, sal, tam, conlai);
        }
        String q = sc.next();
        for(int i = 1; i <= n; i++){
            if(b[i].equals(q)){
                a[i].in();
            }
        }
    }
    
}

/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
TP
*/