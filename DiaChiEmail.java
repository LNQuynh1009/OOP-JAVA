/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Admin
 */
public class DiaChiEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        sc.nextLine();
        ArrayList<String> d = new ArrayList<>();
        while(TC-- > 0){
            String s = sc.nextLine().trim();
            String[] se = s.split("\\s+");
            String res = "";
            res += se[se.length-1].toLowerCase();
            for(int i = 0; i < se.length-1; i++){
                se[i] = se[i].toLowerCase();
                res += se[i].charAt(0);
            }
            d.add(res);
            int cnt = Collections.frequency(d, res);
            if(cnt == 1){
                res += "";
            }
            else{
                res += cnt;
            }
            System.out.println(res + "@ptit.edu.vn");
        }
    }
    
}
