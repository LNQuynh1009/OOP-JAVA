/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */

class Point{
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point p2){
        return Math.sqrt((x-p2.x)*(x - p2.x) + (y-p2.y)*(y-p2.y));
    }
}

public class DienTichTamGiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point p1 = new Point(x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point p2 = new Point(x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point p3 = new Point(x, y);
            double canh1 = p1.distance(p2);
            double canh2 = p2.distance(p3);
            double canh3 = p3.distance(p1);
            //System.out.print(canh1 + " " + canh2 + " " + canh3 + "\n");
            if((canh1+canh2 > canh3) && ( canh1+canh3>canh2) && (canh2+canh3> canh1)){
               double s = 1 / 4f * Math.sqrt((canh1 + canh2 + canh3) * (canh1 + canh2 - canh3) * (canh1 - canh2 + canh3) * (-canh1 + canh2 + canh3));
                System.out.printf("%.2f\n", s);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
    
}
