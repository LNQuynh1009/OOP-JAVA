/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Admin
 */
public class SoLaMa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0 ){
            String s = sc.next();
            int res = 0;
            for(int i = 0; i < s.length(); i++){
                int s1 = value(s.charAt(i));
                if(i+1 < s.length()){
                   int s2 = value(s.charAt(i+1));
                   if(s1 >= s2){
                       res += s1;
                   }
                   else{
                       res = res + s2-s1;
                       i++;
                   }
                }
                else{
                    res += s1;
                }
            }
            System.out.println(res);
        }
    }
    public static int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
    
}
