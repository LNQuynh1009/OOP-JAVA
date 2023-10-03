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
    public String id;
    public String name;
    public String Class;
    public String email;

    public Student(String id, String name, String Class, String email) {
        this.id = id;
        this.name = name;
        this.Class = Class;
        this.email = email;
    }
    public String chuan(){
        return id.substring(5, 7);
    }
    public void in(){
        System.out.println(id + " " + name + " " + Class + " " + email);
    }
}

public class LietKeSinhVienTheoNganh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] a = new Student[n];
        for(int i = 0; i < n; i++){
            String ma = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.next();
            String mail = sc.next();
            a[i] = new Student(ma, ten, lop, mail);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String nganh = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh.toUpperCase() + ": ");
            for(int i = 0; i < n; i++){
                if(nganh.equals("Ke toan") && a[i].chuan().equals("KT")){
                    a[i].in();
                }
                if(nganh.equals("Cong nghe thong tin") && a[i].chuan().equals("CN") && a[i].Class.charAt(0) != 'E'){
                    a[i].in();
                }
                if(nganh.equals("An toan thong tin") && a[i].chuan().equals("AT") && a[i].Class.charAt(0) != 'E'){
                    a[i].in();
                }
                if(nganh.equals("Vien thong") && a[i].chuan().equals("VT")){
                    a[i].in();
                }
                if(nganh.equals("Dien tu") && a[i].chuan().equals("DT")){
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
Ke toan
*/