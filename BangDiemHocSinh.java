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
    public String id;
    public String name;
    public double sum;

    public Student(String id, String name, double sum) {
        this.id = id;
        this.name = name;
        this.sum = sum;
    }

    
    public boolean cmp(Student a){
        if(sum == a.sum){
            return id.compareTo(a.id) == -1;
        }
        return sum > a.sum;
    }
    public void in(){
        System.out.print(id + " " + name + " ");
        System.out.printf("%.1f ", sum);
        if(sum >= 9f){
            System.out.print("XUAT SAC");
        }
        else if(sum >= 8f){
            System.out.print("GIOI");
        }
        else if(sum >= 7f){
            System.out.print("KHA");
        }
        else if(sum >= 5f){
            System.out.print("TB");
        }
        else System.out.print("YEU");
        System.out.println();
    }
}

public class BangDiemHocSinh {

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
            String ma = "HS" + String.format("%02d", i);
            String ten = sc.nextLine();
            double[] diem = new double[10];
            double tong = 0;
            for(int j = 0; j < 10; j++){
                diem[j] = sc.nextDouble();
                if(j == 0 || j == 1){
                    tong += 2.00*diem[j];
                }
                else tong += diem[j];
            }
            tong /= 12.00;
            tong = Math.round(tong*10f) / 10f;
            sc.nextLine();
            a[i] = new Student(ma, ten, tong);
        }
        for(int i = 1; i <= n-1; i++){
            for(int j = i; j <= n; j++){
                if(a[j].cmp(a[i])){
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
    
}

/*
3
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
*/