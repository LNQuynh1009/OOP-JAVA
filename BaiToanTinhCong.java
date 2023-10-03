/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class BaiToanTinhCong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int cong1ngay = sc.nextInt();
        int ngay = sc.nextInt();
        String chuc = sc.next();
        int thuong = 0;
        int phu = 0;
        if(ngay >= 25){
            thuong = (cong1ngay*ngay*20)/100;
        }
        else if(ngay < 25 && ngay >= 22){
            thuong = (cong1ngay*ngay*10)/100;
        }
        else thuong = 0;
        if(chuc.equals("GD")){
            phu = 250000;
        }
        else if(chuc.equals("PGD")){
            phu = 200000;
        }
        else if(chuc.equals("TP")){
            phu = 180000;
        }
        else phu = 150000;
        System.out.println("NV01 " + name + " " + (cong1ngay*ngay) + " " + thuong + " " + phu + " " + (cong1ngay*ngay + thuong + phu));
    }
    
}

/*
Bui Thi Trang
45000
23
PGD
*/