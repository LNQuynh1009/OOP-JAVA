/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
/**
 *
 * @author QUYNH
 */

public class SoKhacNhauTrongFile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        int[] dd = new int[1000];
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.next());
            dd[n]++;
        }
        for(int i = 0; i < 1000; i++){
            if(dd[i] > 0){
                System.out.println(i + " " + dd[i]);
            }
        }
    }
    
}
