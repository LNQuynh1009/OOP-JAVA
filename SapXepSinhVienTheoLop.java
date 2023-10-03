/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Admin
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
    public void in(){
        System.out.println(id + " " + name + " " + Class + " " + email);
    }
}

public class SapXepSinhVienTheoLop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String msv = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.next();
            String mail = sc.next();
            sc.nextLine();
            a.add(new Student(msv, ten, lop, mail));
        }
        Collections.sort(a, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.Class.equals(o2.Class)){
                    return o1.id.compareTo(o2.id);
                }
                return o1.Class.compareTo(o2.Class);
            }
            
        });
        for(int i = 0; i < n; i++){
            a.get(i).in();
        }
    }
    
}
/*
4
B15DCCN216
Nguyen Trong Duc Anh
D15CNPM3
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
D15CQKT03-B
sv4@stu.ptit.edu.vn
*/