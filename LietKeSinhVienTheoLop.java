/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */

class Student{
    public String ID;
    public String name;
    public String Class;
    public String email;

    public Student(String ID, String name, String Class, String email) {
        this.ID = ID;
        this.name = name;
        this.Class = Class;
        this.email = email;
    }
    public void in(){
        System.out.println(ID + " " + name + " " + Class + " " + email);
    }
}

public class LietKeSinhVienTheoLop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] a = new Student[n+1];
        for(int i = 1; i <= n; i++){
            String msv = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.next();
            String mail = sc.next();
            sc.nextLine();
            a[i] = new Student(msv, ten, lop, mail);
        }
        int q = sc.nextInt();
        while(q-- > 0){
            String k = sc.next();
            System.out.println("DANH SACH SINH VIEN LOP " + k + ": ");
            for(int i = 1; i <= n; i++){
                if(a[i].Class.endsWith(k)){
                    a[i].in();
                }
            }
        }
    }
    
}

/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
D15CQKT02-B
*/