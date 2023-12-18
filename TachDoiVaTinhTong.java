/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.io.File;
import java.io.FileNotFoundException;
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
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        while(s.length() > 1){
            BigInteger a1 = new BigInteger(s.substring(0, s.length()/2));
            BigInteger a2 = new BigInteger(s.substring(s.length()/2));
            BigInteger sum = a1.add(a2);
            s = sum.toString();
            System.out.println(s);
        }
    }
    
}
