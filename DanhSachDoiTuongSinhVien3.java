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

public class DanhSachDoiTuongSinhVien3 {

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
            String name = sc.nextLine().trim();
            name = chuan(name);
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
        for(int i = 1; i <= n-1; i++){
            for(int j = i; j <= n; j++){
                if(a[i].diem < a[j].diem){
                    Student tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 1; i <= n; i++){
            a[i].in();
        }
    }
    public static String chuan(String s){
        String[] str = s.split("\\s+");
        String res = "";
        for(int i = 0; i < str.length; i++){
            res += Character.toUpperCase(str[i].charAt(0));
            for(int j = 1; j < str[i].length(); j++){
                res += Character.toLowerCase(str[i].charAt(j));
            }
            res += " ";
        }
        return res;
    }
}

/*
2
ngUYen Van NaM
D20DCCN01-B
2/12/1994
2.17
Nguyen QuanG hAi
D20DCCN02-B
1/9/1994
3.0
*/