/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author QUYNH
 */
public class SoKhacNhauTrongFile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // TODO code application logic here
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] d = new int[1000];
        for(int i = 0; i < 100000; i++){
            d[dis.readInt()]++;
        }
        for(int i = 0; i < 1000; i++){
            if(d[i] > 0){
                System.out.println(i + " " + d[i]);
            }
        }
    }
    
}
