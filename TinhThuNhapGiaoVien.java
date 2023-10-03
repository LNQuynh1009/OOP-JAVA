/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class TinhThuNhapGiaoVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String ma = sc.next();
        sc.nextLine();
        String ten = sc.nextLine();
        long luong = sc.nextLong();
        long phu = 0;
        if(ma.charAt(0) == 'H' && ma.charAt(1) == 'T'){
            phu = 2000000;
        }
        else if(ma.charAt(0) == 'H' && ma.charAt(1) == 'P'){
            phu = 900000;
        }
        else{
            phu = 500000;
        }
        int bac = (ma.charAt(2) - '0')*10 + (ma.charAt(3) - '0');
        System.out.println(ma + " " + ten + " " + bac + " " + phu + " " + (long)(phu+bac*luong));
    }
    
}

/*
HP04
Tran Quoc Huy
1578000
*/