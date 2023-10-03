/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class HinhChuNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int r = sc.nextInt();
        if(d <=0 || r <= 0){
            System.out.println("0");
        }
        else{
            int cv = (d+r)*2;
            int dt = d*r;
            System.out.println(cv + " " + dt);
        }
    }
    
}
