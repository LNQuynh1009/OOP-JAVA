/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 *
 * @author QUYNH
 */
public class ChuanHoaXauHoTenTrongFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String ten = sc.nextLine();
            if(ten.equals("END")){
                break;
            }
            String[] res = ten.trim().split("\\s+");
            String ans = "";
            for(String i : res){
                ans += i.toUpperCase().charAt(0) + i.toLowerCase().substring(1) + " ";
            }
            System.out.println(ans);
        }
    }
    
}
