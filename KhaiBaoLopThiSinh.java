/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
/*
class ThiSinh{
    private String Ten;
    private String ns;
    private float d1;
    private float d2;
    private float d3;

    public ThiSinh(String Ten, String ns, float d1, float d2, float d3) {
        this.Ten = Ten;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
}
*/

public class KhaiBaoLopThiSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String date = sc.next();
        float p1 = sc.nextFloat();
        float p2 = sc.nextFloat();
        float p3 = sc.nextFloat();
        if(date.charAt(2) != '/'){
            date = "0" + date;
        }
        if(date.charAt(5) != '/'){
            String res = date.substring(0, 3) + "0" + date.substring(3);
            date = res;
        }
        System.out.println(name + " " + date + " " + (double)(p1+p2+p3));
    }
    
}
