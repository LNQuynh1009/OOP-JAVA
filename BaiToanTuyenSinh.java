/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class BaiToanTuyenSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        sc.nextLine();
        String name = sc.nextLine();
        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();
        double p3 = sc.nextDouble();
        double diem = 0;
        if(id.charAt(2) == '1'){
            diem = 0.5;
        }
        else if(id.charAt(2) == '2'){
            diem = 1;
        }
        else{
            diem = 2.5;
        }
        String kq = "";
        double tong = p1*2+p2+p3;
        if(tong + diem >= 24){
            kq = "TRUNG TUYEN";
        }
        else kq = "TRUOT";
        System.out.print(id + " " + name + " ");
        if((diem*10)%10 == 0){
            System.out.printf("%.0f ", diem);
        }
        else System.out.printf("%0.1f ", diem);
        if((tong*10)%10 == 0){
            System.out.printf("%.0f ", tong);
        }
        else System.out.printf("%.1f ", tong);
        System.out.println(kq);
    }
    
}

/*
KV2A002
Hoang Thanh Tuan
5
6
5
*/
