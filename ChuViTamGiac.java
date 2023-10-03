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
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    double distance(Point p1, Point p2){
        return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
    }
}

public class ChuViTamGiac {

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
            double canh1 = p1.distance(p1, p2);
            double canh2 = p2.distance(p3, p2);
            double canh3 = p3.distance(p3, p1);
            if((canh1+canh2 > canh3) && (canh2+canh3 > canh1) && (canh1+canh3 > canh2)){
                System.out.printf("%.03f\n", canh1+canh2+canh3);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
