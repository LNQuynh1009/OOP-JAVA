/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */

class Point{
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point a){
        return Math.sqrt((x-a.x)*(x-a.x) + (y-a.y)*(y-a.y));
    }
}

public class DienTichHinhTronNgoaiTiepTamGiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point p1 = new Point(x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point p2 = new Point(x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point p3 = new Point(x, y);
            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);
            if(a+b <= c || a+c <= b || b+c <= a){
                System.out.println("INVALID");
                continue;
            }
            else{
                double S = 1 / 4f * Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c));
                double R = (a*b*c)/(4f*S);
                System.out.printf("%.3f\n" ,Math.PI*(R*R));
            }
        }
    }
    
}
