/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author QUYNH
 */
public class TachDoiVaTinhTong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        String l = sc.next();
        if(l.length() == 1){
            System.out.println(l);
            return;
        }
        while(l.length() > 1){
            BigInteger a = new BigInteger(l.substring(0, l.length()/2));
            BigInteger b = new BigInteger(l.substring(l.length()/2));
            l = a.add(b).toString();
            System.out.println(l);
        }
    }
    
}
