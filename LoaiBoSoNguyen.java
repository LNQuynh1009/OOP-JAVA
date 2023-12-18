/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author QUYNH
 */

public class LoaiBoSoNguyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            try{
                int n = Integer.valueOf(s);
            }
            catch(NumberFormatException e){
                a.add(s);
            }
        }
        Collections.sort(a);
        for(String i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
