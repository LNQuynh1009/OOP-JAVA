/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XayConDaiNhat;
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */
public class XuLyVanBan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNext()){
            s += sc.next() + " ";
        }
        s = s.toLowerCase();
        s = s.replace('?', '.');
        s = s.replace('!', '.');
        s = s.replace(". ", ".");
        String[] res = s.split("\\.");
        for(String tmp : res){
            if(Character.isAlphabetic(tmp.charAt(0))){
                System.out.println(Character.toUpperCase(tmp.charAt(0)) + tmp.substring(1));
                continue;
            }
            for(int i = 0; i < tmp.length(); i++){
                if(Character.isAlphabetic(tmp.charAt(i)) || Character.isDigit(tmp.charAt(i))){
                    System.out.println(tmp);
                    break;
                }
            }
        }
        sc.close();
    }
    
}
