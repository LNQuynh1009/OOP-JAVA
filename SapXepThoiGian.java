/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Admin
 */

class Time{
    private int gio;
    private int phut;
    private int giay;

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    
    public void in(){
        System.out.println(gio + " " + phut + " " + giay);
    }
    
    public boolean compareTo(Time g){
        if(this.gio != g.gio){
            return this.gio > g.gio;
        }
        if(this.phut != g.phut){
            return this.phut > g.phut;
        }
        return this.giay > g.giay;
    }
}

public class SapXepThoiGian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Time[] a = new Time[n];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            a[i] = new Time(x, y, z);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[i].compareTo(a[j])){
                    Time tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(Time i : a){
            i.in();
        }
    }
    
}

/*
3
11 20 20
14 20 14
11 15 12
*/