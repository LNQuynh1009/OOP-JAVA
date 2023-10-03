/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */

class Employee{
    public String ma;
    public String ten;
    public String gt;
    public String ns;
    public String dc;
    public String ms;
    public String ngay;

    public Employee(String ma ,String ten, String gt, String ns, String dc, String ms, String ngay) {
        this.ma = ma;
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.ms = ms;
        this.ngay = ngay;
    }
    public boolean cmp(Employee e){
        int nam1 = Integer.parseInt(ns.substring(6));
        int nam2 = Integer.parseInt(e.ns.substring(6));
        if(nam1 != nam2){
            return nam1 > nam2;
        }
        int m1 = (ns.charAt(3)-'0')*10 + (ns.charAt(4)-'0');
        int m2 = (e.ns.charAt(3)-'0')*10 + (e.ns.charAt(4)-'0');
        if(m1 != m2){
            return m1 > m2;
        }
        int d1 = (ns.charAt(0)-'0')*10 + (ns.charAt(1)-'0');
        int d2 = (e.ns.charAt(0)-'0')*10 + (e.ns.charAt(1)-'0');
        return d1 > d2;
    }
    public void in(){
        System.out.println(ma + " " + ten + " " + gt + " " + ns + " " + dc + " " + ms + " " + ngay);
    }
}

public class SapXepDanhSachDoiTuongNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] a = new Employee[n+1];
        for(int i = 1; i <= n; i++){
            String name = sc.nextLine();
            String sex = sc.next();
            String birth = sc.next();
            sc.nextLine();
            String address = sc.nextLine();
            String mst = sc.next();
            String date = sc.next();
            sc.nextLine();
            a[i] = new Employee(String.format("%05d", i), name, sex, birth, address, mst, date);
        }
        for(int i = 1; i <= n-1; i++){
            for(int j = i; j <= n; j++){
                if(a[i].cmp(a[j])){
                    Employee tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 1; i <= n; i++){
            a[i].in();
        }
    }
    
}
/*
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011
*/